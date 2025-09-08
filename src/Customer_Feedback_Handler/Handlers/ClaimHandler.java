package Customer_Feedback_Handler.Handlers;

import Customer_Feedback_Handler.Abstract.Handler;
import Customer_Feedback_Handler.Message;
import Customer_Feedback_Handler.MessageType;

public class ClaimHandler extends Handler {
    private static final MessageType type = MessageType.CLAIM;
    private static final int compensationamount = 100;

    @Override
    public void process(Message message) {
        if (message.getType() == type) {
            if (Integer.parseInt(message.getContent()) < compensationamount) {
                System.out.println("Claim Handler: Message handled, your claim will be compensated.");
            } else {
                System.out.println("Claim Handler: Message handled, your claim will be manually reviewed and responded to in 7 years.");
            }
        } else {
            System.out.println("Claim Handler: Cannot handle. Sending to next handler.");
            super.process(message);
        }
    }
}
