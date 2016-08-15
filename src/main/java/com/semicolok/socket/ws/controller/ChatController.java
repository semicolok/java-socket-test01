package com.semicolok.socket.ws.controller;

import com.semicolok.socket.domain.Message;
import com.semicolok.socket.domain.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ChatController {

	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message) {
		return new OutputMessage(message, new Date());
	}
}