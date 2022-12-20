package org.example.bot;

public class ResponseWithError extends BotResponse {
    public ResponseWithError(String message) {
        super();
        Long userID = null;
        super(message, userID);
    }

    @Override
    public BotRequest read() {
        return null;
    }
}
