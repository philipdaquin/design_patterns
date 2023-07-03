package org.example;

public class ConcreteB implements  Handler{
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getType().equals(RequestType.TYPE_A))
            System.out.println("HandlerA handles the request ");
        else if (nextHandler != null)
            nextHandler.handleRequest(request);
    }
}
