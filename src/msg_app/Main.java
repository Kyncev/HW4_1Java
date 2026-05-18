package msg_app;

interface Printer {

    void print(MessagePrinter.Message message);
}

class MessagePrinter implements Printer {

    public static class Message {

        private String text;
        private String sender;

        public Message(String text, String sender) {
            this.text = text;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getSender() {
            return sender;
        }

        public void setText(String text) {
            this.text = text;
        }
        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {

        // Якщо text і sender null
        if (message.getText() == null && message.getSender() == null) {

            Runnable emptyMessage = new Runnable() {

                @Override
                public void run() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            emptyMessage.run();
            return;
        }

        if (message.getSender() == null || message.getSender().isEmpty()) {
            System.out.println("Анонімний користувач відправив повідомлення: " + message.getText());
        }

        else {
            System.out.println(
                    "Користувач "
                            + message.getSender()
                            + " відправив повідомлення: "
                            + message.getText()
            );
        }
    }
}

public class Main {

    public static void main(String[] args) {

        MessagePrinter printer = new MessagePrinter();

        MessagePrinter.Message msg1 =
                new MessagePrinter.Message(
                        "Доброго дня, Андрій!",
                        "Vitalii"
                );

        MessagePrinter.Message msg2 =
                new MessagePrinter.Message(
                        "Таємне повідомлення",
                        null
                );

        MessagePrinter.Message msg3 =
                new MessagePrinter.Message(
                        null,
                        null
                );

        printer.print(msg1);

        printer.print(msg2);

        printer.print(msg3);
    }
}