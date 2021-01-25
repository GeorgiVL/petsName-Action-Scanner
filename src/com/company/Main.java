package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your petsName: ");
        String name = scanner.nextLine();

        System.out.println("Favorite action: ");
        String favoriteAction = scanner.nextLine();

        System.out.println(name + " is a dog and usually he likes to " + favoriteAction + ".");

    }
}
