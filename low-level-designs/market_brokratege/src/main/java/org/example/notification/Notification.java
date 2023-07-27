package org.example.notification;

import java.time.LocalDateTime;

public abstract class Notification {

    public int notificationId;
    public LocalDateTime createdAt;
    public String content;


    public Boolean send() {
        return true;
    }
}
