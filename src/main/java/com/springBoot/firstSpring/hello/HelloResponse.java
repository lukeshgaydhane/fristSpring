package com.springBoot.firstSpring.hello;

public class HelloResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloResponse{" +
                "message='" + message + '\'' +
                '}';
    }

    public HelloResponse(String message) {
        this.message = message;
    }
}
