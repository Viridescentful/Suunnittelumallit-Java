package Customer_Feedback_Handler;

public class Message {
    private String content;
    private String email;
    private MessageType type;

    public Message(String content, String email, MessageType type) {
        this.content = content;
        this.email = email;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public String getEmail() {
        return email;
    }

    public MessageType getType() {
        return type;
    }
}
