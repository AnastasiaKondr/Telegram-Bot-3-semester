package org.example;

public class Main {
    public static void main(String[] args) {

        Reader reader = new ReaderConsole();
        Writer writer = new WriterConsole();
        Handler handler = new SimpleHandler();

        while (true) {
            BotRequest request = reader.read();
            if (request.getMessage().isEmpty()) {
                break;
            }
            BotResponse response = handler.returnResponse(request);
            writer.write(response);
        }
    }
}