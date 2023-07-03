package org.example;

public interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(Request request);
}
