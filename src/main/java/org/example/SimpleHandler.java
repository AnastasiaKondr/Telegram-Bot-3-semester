package org.example;

public class SimpleHandler implements Handler {

    @Override
    public BotResponse returnResponse(BotRequest request){
        return new BotResponse(request.getMessage());
    };
}
