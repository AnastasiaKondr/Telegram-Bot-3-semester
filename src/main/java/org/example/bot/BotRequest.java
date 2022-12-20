package org.example.bot;

public class BotRequest{
    private final String message;
    private final long userID;

    public BotRequest(String message) {
        this.message = message;
        this.userID = userID;
    }

    public String getMessage() {
        return message;
    }

    public Long getUserID() {
        return userID;
    }
}