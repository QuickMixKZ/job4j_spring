package ru.jo4j.spring.di;

import java.util.Scanner;

public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}