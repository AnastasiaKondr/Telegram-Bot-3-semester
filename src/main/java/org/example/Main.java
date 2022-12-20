package org.example;

import org.example.bot.*;
import org.example.handling.Handler;
import org.example.handling.SimpleHandler;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Writer writer = null;
        Reader reader = new ReaderConsole(null);
        writer = new WriterConsole();
        Handler handler = new SimpleHandler();

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            Bot bot = new Bot(Main.createBot().getBotUsername(), Main.createBot().getBotToken(), reformer, reformer1);
            telegramBotsApi.registerBot(bot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            BotRequest request = reader.read();
            if (request.getMessage().isEmpty()) {
                break;
            }
            BotResponse response = handler.returnResponse(request);
            writer.write(response);
        }
    }
    private static Bot createBot() throws URISyntaxException, IOException {
        //URL link = Main.class.getResource("application.properties");
        Properties properties = new Properties();
        //properties.load(new FileInputStream(new File(link.toURI())));
        properties.load(new FileInputStream("src/main/resources/application.properties"));
        String botName = (String) properties.get("bot.name");
        String botToken = (String) properties.get("bot.token");
        return new Bot(botName, botToken, reformer, reformer1);
    }
}