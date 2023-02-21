package com.example.models.Notifications;

import java.time.Instant;

public class Notify { 
    private Long emailId;
    private Long userId;
    private Long messageId;
    private String message;
    private String subject;
    private Instant notifiedOn;
    private NotifyState state;
}