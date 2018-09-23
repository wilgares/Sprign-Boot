package com.will.dto;

import java.util.List;

public class WraperListaAllPais {
	private List<String> messages;
	private List<Pais> result;
	
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
	public List<Pais> getResult() {
		return result;
	}
	public void setResult(List<Pais> result) {
		this.result = result;
	}
	
}
