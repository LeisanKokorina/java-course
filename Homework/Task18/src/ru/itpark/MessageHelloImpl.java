package ru.itpark;

public class MessageHelloImpl implements Message {
    private String text;

    public MessageHelloImpl(String text) {
        this.text = "Hello, " + text;
    }

    @Override
    public String getText() {
        return text;
    }
}
