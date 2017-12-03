package ru.itpark;

public class MessageRenderErrorOutImpl implements MessageRenderer {
    private Message message;

    public MessageRenderErrorOutImpl(Message message) {
        this.message = message;
    }

    @Override
    public void render() {
        System.err.println(message.getText());
    }
}
