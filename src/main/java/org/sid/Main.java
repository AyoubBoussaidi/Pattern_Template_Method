package org.sid;

public class Main {

    public static void main(String[] args) {
        System.out.println("Préparation de café :");
        Boisson cafe = new Cafe();
        cafe.preparer();

        System.out.println("\nPréparation de thé :");
        Boisson the = new The();
        the.preparer();
    }
}