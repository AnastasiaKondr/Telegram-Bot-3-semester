package org.example;

public class SimpleHandler implements Handler {

    @Override
    public BotResponse returnResponse(BotRequest request){
        return new BotResponse(request.getMessage());
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