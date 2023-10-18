package com.neizatheedev.classtutorial.Model;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Wednesday October 2023
 * @Time: 3:58 AM
 */

public class Chat {

    private String chatName;
    private String lastMessage;

    // Default constructor is required for Firestore
    public Chat() {}

    public Chat(String chatName, String lastMessage) {
        this.chatName = chatName;
        this.lastMessage = lastMessage;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}

