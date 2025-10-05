package cat1;
import java.util.Scanner;
public class numberconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            printMenu();
            int choice = getInput(scanner, "Enter your choice: (0 to exit) ");
        
        switch (choice) {
            case 0:
                keepRunning = false;
                System.out.println("Exiting...");
                break;
            case 1:
                System.out.print("Enter decimal number: ");
                int decimal = scanner.nextInt();
                System.out.println("Binary: " + decimalToBinary(decimal));
                break;
            case 2:
                System.out.print("Enter binary number: ");
                String binary = scanner.next();
                System.out.println("Decimal: " + binaryToDecimal(binary));
                break;
            case 3:
                System.out.print("Enter decimal number: ");
                decimal = scanner.nextInt();
                System.out.println("Hexadecimal: " + decimalToHexadecimal(decimal));
                break;
            case 4:
                System.out.print("Enter hexadecimal number: ");
                String hex = scanner.next();
                System.out.println("Decimal: " + hexadecimalToDecimal(hex));
                break;
            case 5:
                System.out.print("Enter decimal number: ");
                decimal = scanner.nextInt();
                System.out.println("Octal: " + decimalToOctal(decimal));
                break;
            case 6:
                System.out.print("Enter octal number: ");
                String octal = scanner.next();
                System.out.println("Decimal: " + octalToDecimal(octal));
                break;
            case 7:
                System.out.print("Enter binary number: ");
                binary = scanner.next();
                System.out.println("Hexadecimal: " + binaryToHexadecimal(binary));
                break;
            case 8:
                System.out.print("Enter hexadecimal number: ");
                hex = scanner.next();
                System.out.println("Binary: " + hexadecimalToBinary(hex));
                break;
            case 9:
                System.out.print("Enter binary number: ");
                binary = scanner.next();
                System.out.println("Octal: " + Integer.toOctalString(binaryToDecimal(binary)));
                break;
            case 10:
                System.out.print("Enter octal number: ");
                octal = scanner.next();
                System.out.println("Binary: " + decimalToBinary(octalToDecimal(octal)));
                break;
            case 11:
                System.out.print("Enter hexadecimal number: ");
                hex = scanner.next();
                System.out.println("Octal: " + Integer.toOctalString(hexadecimalToDecimal(hex)));
                break;
            case 12:
                System.out.print("Enter octal number: ");
                octal = scanner.next();
                System.out.println("Hexadecimal: " + Integer.toHexString(octalToDecimal(octal)));
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Return to main menu? (yes/no)");
        String response = scanner.next();
        if (!response.equalsIgnoreCase("yes")) {
            keepRunning = false;
            System.out.println("Exiting...");
        }
        System.out.println();
        }
            scanner.close();

    }
        public static void printMenu() {
        System.out.println("Choose conversion type:");
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Binary to Decimal");
        System.out.println("3. Decimal to Hexadecimal");
        System.out.println("4. Hexadecimal to Decimal");
        System.out.println("5. Decimal to Octal");
        System.out.println("6. Octal to Decimal");
        System.out.println("7. Binary to Hexadecimal");
        System.out.println("8. Hexadecimal to Binary");
        System.out.println("9. Binary to Octal");
        System.out.println("10. Octal to Binary");
        System.out.println("11. Hexadecimal to Octal");
        System.out.println("12. Octal to Hexadecimal");
        System.out.println("0. Exit");
    }
    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
        
    }
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String decimalToHexadecimal(int decimal) {
        return Integer.toHexString(decimal).toUpperCase();
    }

    public static int hexadecimalToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }

    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static String hexadecimalToBinary(String hex) {
        return decimalToBinary(hexadecimalToDecimal(hex));
    }

    public static String binaryToHexadecimal(String binary) {
        return decimalToHexadecimal(binaryToDecimal(binary));
    }

    public static String octalToBinary(String octal) {
        return decimalToBinary(octalToDecimal(octal));
    }

    public static String binaryToOctal(String binary) {
        return decimalToOctal(binaryToDecimal(binary));
    }

    public static String hexadecimalToOctal(String hex) {
        return decimalToOctal(hexadecimalToDecimal(hex));
    }

    public static String octalToHexadecimal(String octal) {
        return decimalToHexadecimal(octalToDecimal(octal));
    }
}
        


