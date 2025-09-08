package Customer_Feedback_Handler.Abstract;

import Customer_Feedback_Handler.Message;

public abstract class Handler {
    private Handler nextHandler;

    public void process(Message message) {
        if (nextHandler != null) {
            nextHandler.process(message);
        }
    }
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
