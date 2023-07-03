package org.example;

public class Request {
    private final String description;

    private final RequestType type;

    public Request(String description, RequestType type) {
        this.description = description;
        this.type = type;
    }

    public RequestType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
