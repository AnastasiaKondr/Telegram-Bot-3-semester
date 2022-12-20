package org.example.bot;

public class WriterConsole implements Writer {
    @Override
    public void write(BotResponse data) {
        // Отправляет сообщения в консоль
        if (data instanceof ResponseWithError) {
            System.out.println("Error: " + data.getMessage());
        }
        System.out.println(data.getMessage());
    }
}
