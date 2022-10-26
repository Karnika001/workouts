package Basics;

import java.util.Scanner;

public class getinput{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2022 - yearOfBirth;

        System.out.println("Hi " + name + ", and you are " + age + " years old.");

        scanner.close();
    }
}


