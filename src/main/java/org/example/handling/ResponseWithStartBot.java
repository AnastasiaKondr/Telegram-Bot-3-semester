package org.example.handling;

import org.example.bot.BotRequest;
import org.example.bot.BotResponse;

public class ResponseWithStartBot extends BotResponse {
    public ResponseWithStartBot(Long userID) {
        super();
    }

    @Override
    public BotRequest read() {
        return null;
    }
}
