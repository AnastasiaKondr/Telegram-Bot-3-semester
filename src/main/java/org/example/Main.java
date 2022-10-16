package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Bot1 bot = new Bot1();
        bot.hello();
        System.out.println("Please input 1 if you want me to return your text");
        Integer op = in.nextInt();
        while (op == 1) {
            bot.itext();
            System.out.println("input 1 if you want me to return your text");
            op = in.nextInt();
        }
    }
}