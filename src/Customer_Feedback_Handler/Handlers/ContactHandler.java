package Customer_Feedback_Handler.Handlers;

import Customer_Feedback_Handler.Abstract.Handler;
import Customer_Feedback_Handler.Message;
import Customer_Feedback_Handler.MessageType;

public class ContactHandler extends Handler {
    private static final MessageType type = MessageType.CONTACT;

    @Override
    public void process(Message message) {
        if (message.getType() == type) {
            System.out.println("Contact Handler: Message handled, thank you for contacting, we will get back to you in 4 business days.");
            System.out.println();
        } else {
            System.out.println("Contact Handler: Cannot handle. Sending to next handler.");
            System.out.println();
            super.process(message);
        }
    }
}
