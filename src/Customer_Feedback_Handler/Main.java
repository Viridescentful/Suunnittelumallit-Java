package Customer_Feedback_Handler;

import Customer_Feedback_Handler.Abstract.Handler;
import Customer_Feedback_Handler.Handlers.ClaimHandler;
import Customer_Feedback_Handler.Handlers.ContactHandler;
import Customer_Feedback_Handler.Handlers.DevelopmentHandler;
import Customer_Feedback_Handler.Handlers.FeedbackHandler;

public class Main {
    public static void main(String[] args) {
        Handler primaryhandler;

        Handler feedbackhandler = new FeedbackHandler();
        Handler developmenthandler = new DevelopmentHandler();
        Handler contacthandler = new ContactHandler();
        Handler claimhandler = new ClaimHandler();

        feedbackhandler.setNextHandler(developmenthandler);
        developmenthandler.setNextHandler(contacthandler);
        contacthandler.setNextHandler(claimhandler);

        primaryhandler = feedbackhandler;

        Message message1 = new Message("Great service!", "Alice@saosda.fi", MessageType.DEVELOPMENT);
        Message message2 = new Message("4000", "Alice@saosda.fi", MessageType.CLAIM);
        Message message3 = new Message("Add more fooditems!", "Alice@saosda.fi", MessageType.CONTACT);
        Message message4 = new Message("You should reduce the amount of mold!", "Alice@saosda.fi", MessageType.DEVELOPMENT);

        primaryhandler.process(message1);
        primaryhandler.process(message2);
        primaryhandler.process(message3);
        primaryhandler.process(message4);

    }
}
