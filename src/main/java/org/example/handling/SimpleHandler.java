package org.example.handling;

import org.example.bot.BotRequest;
import org.example.bot.BotResponse;
import org.example.bot.User;

public class SimpleHandler implements Handler {

    public SimpleHandler() {
    }

    @Override
    public BotResponse returnResponse(BotRequest request) {
        Long userID = request.getUserID();
        String message = request.getMessage();
        User user = null;
        var usersMap = user.getUsersHashMap();

        if (request.getMessage().startsWith("/start")) {
            user.addUserData(userID, usersMap);
            return new ResponseWithStartBot(userID);
        }
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