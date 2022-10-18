package org.example;

public class WriterConsole implements Writer{
    @Override
    public void write(BotResponse response) {
        System.out.println(response.getMessage());
    }
}
