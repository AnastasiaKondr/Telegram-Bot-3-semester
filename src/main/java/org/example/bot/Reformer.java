package org.example.bot;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import javax.ws.rs.core.Response;

public class Reformer {
    public SendMessage makeMessageFromResponse(Response response) {
        return SendMessage.builder()
                .chatId(response.getUserID().toString())
                .text(response.getMessage())
                .build();
    }
}
