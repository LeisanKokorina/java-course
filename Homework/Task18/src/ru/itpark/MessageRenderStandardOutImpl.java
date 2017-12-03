package ru.itpark;

public class MessageRenderStandardOutImpl implements MessageRenderer {
    private Message message;

    public MessageRenderStandardOutImpl(Message message) {
        this.message = message;
    }

    @Override
    public void render() {
        System.out.println(message.getText());
    }
}
