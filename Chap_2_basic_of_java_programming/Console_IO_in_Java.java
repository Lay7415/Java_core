package Chap_2_basic_of_java_programming;

import java.util.Scanner;

public class Console_IO_in_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        System.out.println();

        System.out.print("Enter your age: ");
        byte age = scanner.nextByte();
        System.out.println();

        System.out.printf("Your name is %s and you are %d years old", name, age);
        System.out.println();
        scanner.close();
    }
}