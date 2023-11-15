package org.example;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка A: ");
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("Список А: " + listA);

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка B: ");
            String inputStr = scanner.nextLine();
            listB.add(inputStr);
        }

        System.out.println("Список Б: " + listB);

        ArrayList<String> listC = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }


        System.out.println("Список С: " + listC);

        Collections.sort(listC, Comparator.comparing(String::length));
        System.out.println("Отсортированный список C: " + listC);
    }
}