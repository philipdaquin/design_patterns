package org.example;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User user_ : users) {
            // Exclude the user who sent the message
            if (user_ != user) user_.receiveMessage(message);
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);

    }
}
