package org.example.bot;

public abstract class BotResponse{

    private String message = null;
    private Long userID = null;

    // Конструктор бота
    public BotResponse() {
        this.message = message;
        this.userID = userID;
    }

    public String getMessage() {
        return message;
    }

    public Long getUserID() {
        return userID;
    }

    public abstract org.example.bot.BotRequest read();
}