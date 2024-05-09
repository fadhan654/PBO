public class StringManipulationCombined {
    public static void main(String[] args) {
        String input = "NUGRAHA";
        int length = input.length();
        
        System.out.println("1:");
        for (int i = 0; i < length; i++) {
            String output = "";
            for (int j = 0; j < length; j++) {
                if (j < length - i) {
                    output += input.charAt(j);
                } else {
                    output += "*";
                }
            }
            System.out.println(output);
        }
        System.out.println(); 

        System.out.println("2:");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i) {
                    System.out.print(input.charAt(i)); 
                } else {
                    System.out.print("*"); 
                }
            }
            System.out.println(); 
        }
        System.out.println();
        
        System.out.println("3:");
        printVertically(input);
    }

    public static void printVertically(String name) {
        int middleIndex = name.length() / 2; 
        for (int i = 0; i < name.length(); i++) {
            if (i == middleIndex) {
                System.out.println(name); 
            } else {
                System.out.println("***" + name.charAt(i) + "***"); 
            }
        }
    }
}
