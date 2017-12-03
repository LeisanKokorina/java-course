package ru.itpark;

public class Main {

    public static void main(String[] args) {
        //ComponentsFactory factory = new ComponentsFactory();
        //Message message = factory.getMessageComponent();
        //System.out.println(message.getText());
        ComponentsFactory factory = ComponentsFactory.getInstance();
        MessageRenderer messageRenderer = factory.getMessageComponent();
        messageRenderer.render();
    }

}
