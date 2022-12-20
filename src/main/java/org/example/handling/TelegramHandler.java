package org.example.handling;

import org.example.bot.BotRequest;
import org.example.bot.BotResponse;

public class TelegramHandler implements Handler {
    @Override
    public BotResponse returnResponse(BotRequest request){
        return new BotResponse();
    }

    @Override
    public void doneTask() {

    }

    @Override
    public void changeTask() {

    }

    @Override
    public void updateTask() {

    }

    @Override
    public void deleteTask() {

    }
}
