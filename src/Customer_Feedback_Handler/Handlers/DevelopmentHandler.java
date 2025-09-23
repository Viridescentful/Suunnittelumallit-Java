package Customer_Feedback_Handler.Handlers;

import Customer_Feedback_Handler.Abstract.Handler;
import Customer_Feedback_Handler.Message;
import Customer_Feedback_Handler.MessageType;

import java.util.ArrayList;

public class DevelopmentHandler extends Handler {
    private static final MessageType type = MessageType.DEVELOPMENT;

    private final ArrayList<String> suggestions = new ArrayList<>();

    @Override
    public void process(Message message) {
        if (message.getType() == type) {
            System.out.println("Development Handler: Message handled, thank you for your development suggestion.");
            System.out.println();
            suggestions.add(message.getContent());
            System.out.println("Feedback Handler: Here are some suggestions:");
            for (String suggestion : suggestions) {
                System.out.println("- " + suggestion);
            }
            System.out.println();
        } else {
            System.out.println("Development Handler: Cannot handle. Sending to next handler.");
            System.out.println();
            super.process(message);
        }
    }
}
