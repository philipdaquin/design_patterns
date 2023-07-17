package org.example.notification;

import java.util.Date;

public class Notification {
    public Integer notificationId;

    public Date createdOn;

    public String content;

    public Boolean send() {
        return true;
    }

}
