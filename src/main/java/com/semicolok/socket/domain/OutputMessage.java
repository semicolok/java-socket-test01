package com.semicolok.socket.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class OutputMessage extends Message {

	@NotNull(message = "comsss")
	private Date time;

	public OutputMessage(){
	}

	public OutputMessage(Message original, Date time) {
		super(original.getId(), original.getMessage());
		this.time = time;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}
