package com.example.bank_app.controller;

import com.example.bank_app.entity.Account;
import com.example.bank_app.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    // Endpoint untuk menampilkan halaman daftar semua akun
    @GetMapping("/list")
    public String listAccounts(Model model) {
        List<Account> accounts = accountService.getAllAccounts();
        model.addAttribute("accounts", accounts);
        return "list-account";
    }

    // Endpoint untuk menampilkan halaman tambah akun
    @GetMapping("/add")
    public String showAddAccountForm(Model model) {
        model.addAttribute("account", new Account());
        return "add-edit-account";
    }

    // Endpoint untuk menyimpan akun baru
    @PostMapping("/save")
    public String addAccount(@ModelAttribute("account") Account account) {
        accountService.saveAccount(account);
        return "redirect:/accounts/list";
    }

    // Endpoint untuk menampilkan halaman edit akun berdasarkan ID
    @GetMapping("/update/{id}")
    public String showEditAccountForm(@PathVariable("id") Long id, Model model) {
        Optional<Account> account = accountService.getAccountById(id);
        account.ifPresent(acc -> model.addAttribute("account", acc));
        return "add-edit-account";
    }

    // Endpoint untuk menyimpan perubahan pada akun
    @PostMapping("/update/{id}")
    public String updateAccount(@PathVariable("id") Long id, @ModelAttribute("account") Account accountDetails) {
        Optional<Account> existingAccount = accountService.getAccountById(id);
        if (existingAccount.isPresent()) {
            Account account = existingAccount.get();
            account.setAccountNumber(accountDetails.getAccountNumber());
            account.setAccountName(accountDetails.getAccountName());
            account.setBalance(accountDetails.getBalance());
            account.setPassword(accountDetails.getPassword()); // Menyimpan password yang baru diubah
            accountService.saveAccount(account);
        }
        return "redirect:/accounts/list";
    }

    // Endpoint untuk menampilkan halaman konfirmasi hapus akun berdasarkan ID
    @GetMapping("/delete/{id}")
    public String showDeleteAccountForm(@PathVariable("id") Long id, Model model) {
        Optional<Account> account = accountService.getAccountById(id);
        account.ifPresent(acc -> model.addAttribute("account", acc));
        return "delete-account";
    }

    // Endpoint untuk menghapus akun berdasarkan ID
    @PostMapping("/delete/{id}")
    public String deleteAccount(@PathVariable("id") Long id) {
        accountService.deleteAccountById(id);
        return "redirect:/accounts/list";
    }
}
