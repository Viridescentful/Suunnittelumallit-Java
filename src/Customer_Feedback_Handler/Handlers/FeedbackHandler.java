package Customer_Feedback_Handler.Handlers;

import Customer_Feedback_Handler.Abstract.Handler;
import Customer_Feedback_Handler.Message;
import Customer_Feedback_Handler.MessageType;

import java.util.ArrayList;

public class FeedbackHandler extends Handler {
    private static final MessageType type = MessageType.GENERAL;


    @Override
    public void process(Message message) {
        if (message.getType() == type) {
            System.out.println("Feedback Handler: Message handled, thank you for your feedback.");
        } else {
            System.out.println("Feedback Handler: Cannot handle. Sending to next handler.");
            super.process(message);
        }
    }
}
