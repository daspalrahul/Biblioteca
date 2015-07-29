package com.twu.biblioteca;


import java.util.Scanner;

public class Console {

    public void printOutput(String result) {
        System.out.println(result);
    }

    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
