package org.example;

public class TelegramHandler implements Handler{
    @Override
    public BotResponse returnResponse(BotRequest request){
        return new BotResponse(request.getMessage());
    }
}
