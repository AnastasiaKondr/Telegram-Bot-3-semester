package org.example;
import java.util.Scanner;

public class ReaderConsole implements Reader{
    @Override
    public BotRequest read() {
        Scanner scanner = new Scanner(System.in);
        return new BotRequest(scanner.nextLine());
    }

}