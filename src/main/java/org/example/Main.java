package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            Bot bot = new Bot(Main.createBot().getBotUsername(), Main.createBot().getBotToken());
            telegramBotsApi.registerBot(bot);
        }
        catch (TelegramApiException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*
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
        }*/
    }
    private static Bot createBot() throws URISyntaxException, IOException {
        URL link = Main.class.getResource("/application.properties");
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File(link.toURI())));
        String botName = (String) properties.get("bot.name");
        String botToken = (String) properties.get("bot.token");
        return new Bot(botName, botToken);
    }
}