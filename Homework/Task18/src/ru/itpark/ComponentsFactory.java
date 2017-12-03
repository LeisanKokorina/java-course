package ru.itpark;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

public class ComponentsFactory {
    private final static ComponentsFactory instance;
    private Properties properties;

    public ComponentsFactory() {
        properties = new Properties();
        try {
            properties.load(new FileReader("application.properties"));
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }
    static {
        instance = new ComponentsFactory();
    }
    public static ComponentsFactory getInstance(){
        return instance;
    }

    public MessageRenderer getMessageComponent() {
        String messageText = properties.getProperty("message.text");
        String className = properties.getProperty("message.class");
        String classRenderer = properties.getProperty("renderer.class");
        try {
            Class<Message> messageClass = (Class<Message>)Class.forName(className);
            Constructor<Message> messageConstructor = messageClass.getConstructor(String.class);
            Message message = messageConstructor.newInstance(messageText);

            Class<MessageRenderer> rendererClass = (Class<MessageRenderer>)Class.forName(classRenderer);
            Constructor<MessageRenderer> rendererConstructor = rendererClass.getConstructor(Message.class);
            MessageRenderer messageRenderer = rendererConstructor.newInstance(message);

            return messageRenderer;
        } catch (ReflectiveOperationException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
