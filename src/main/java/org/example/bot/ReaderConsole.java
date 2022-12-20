package org.example.bot;

import java.util.*;

public class ReaderConsole implements Reader {
    private static final BotResponse inputResponse = new BotResponse() {
    private final Scanner consoleScanner = new Scanner(System.in);
    private Writer writer;

    public void ReaderConsole(Writer writer) {
        this.writer = writer;
    }

    @Override
    public BotRequest read() {
        // Чтение из консоли и возврат запроса
        writer.write(inputResponse);
        return new BotRequest(consoleScanner.nextLine());
    }
}