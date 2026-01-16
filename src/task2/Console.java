package task2;
import java.util.Scanner;

public class Console {
    // Static variable (shared across all objects)
        static String companyName = "Java Internship";

        // Instance variables (belong to object)
        int instanceCount = 1;
        double instanceValue = 10.5;

        public static void main(String[] args) {
            byte b = 10;          // 1 byte
            short s = 100;        // 2 bytes
            int i = 1000;         // 4 bytes
            long l = 100000L;     // 8 bytes
            float f = 10.5f;      // 4 bytes
            double d = 20.99;     // 8 bytes
            char c = 'A';         // 2 bytes
            boolean isJavaFun = true; // 1 bit
            System.out.println("=== Primitive Data Types ===");
            System.out.println("byte: " + b);
            System.out.println("short: " + s);
            System.out.println("int: " + i);
            System.out.println("long: " + l);
            System.out.println("float: " + f);
            System.out.println("double: " + d);
            System.out.println("char: " + c);
            System.out.println("boolean: " + isJavaFun);
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n=== Calculator ===");

            System.out.print("Enter first number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter numbers only.");
                return;
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Please enter numbers only.");
                return;
            }
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            double diff = num1 - num2;
            double product = num1 * num2;
            double division = (num2 != 0) ? num1 / num2 : 0;

            System.out.println("\n=== Results ===");
            System.out.printf("Addition: %.2f%n", sum);
            System.out.printf("Subtraction: %.2f%n", diff);
            System.out.printf("Multiplication: %.2f%n", product);
            if (num2 != 0) {
                System.out.printf("Division: %.2f%n", division);
            } else {
                System.out.println("Division not possible (divide by zero)");
            }

            // Type Casting
            int castedValue = (int) d; // Explicit casting
            double autoCast = i;       // Implicit casting
            System.out.println("\n=== Type Casting ===");
            System.out.println("Double to int: " + castedValue);
            System.out.println("Int to double: " + autoCast);

            // Accessing static variable
            System.out.println("\nCompany Name: " + companyName);

            scanner.close();
        }
    }



