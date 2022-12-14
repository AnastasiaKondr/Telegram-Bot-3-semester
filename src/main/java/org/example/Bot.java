package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {
    private final String botName;
    private final String botToken;
    TelegramHandler handler;

    public Bot(String botName, String botToken) {
        this.botName = botName;
        this.botToken = botToken;
        handler = new TelegramHandler();
    }

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        try{
            if(update.hasMessage() && update.getMessage().hasText())
            {
                Message inMess = update.getMessage();                // Извлекаем из объекта сообщение пользователя
                String chatId = inMess.getChatId().toString();      // Достаем из inMess id чата пользователя
                String response = parseMessage(inMess.getText());   // Получаем текст сообщения пользователя

                // Отправляем в написанный нами обработчик
                SendMessage outMess = new SendMessage();         // Будущий ответ пользователю

                // Добавляем в наше сообщение id чата и наш ответ
                outMess.setChatId(chatId);
                outMess.setText(response);

                // Отправка в чат
                execute(outMess);
            }
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    public String parseMessage(String textMsg) {
        String response = new String();

        //Сравниваем текст пользователя с нашими командами, на основе этого формируем ответ
        if(textMsg.equals("/start"))
            response = "Приветствую, я твой To Do лист! Ты можешь вносить в меня свои задачи." +
                    " Жми /get, чтобы получить команды";
        else{
            BotRequest request = new BotRequest(textMsg);

            BotResponse botResponse = handler.returnResponse(request);
            response = botResponse.getMessage();
        }
        return response;
    }
}