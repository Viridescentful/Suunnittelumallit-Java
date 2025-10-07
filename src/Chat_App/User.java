package Chat_App;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.util.Objects;

public class User {
    private String username;
    private ChatWindow chatWindow;
    private ChatMediator chatMediator;


    public User(String username, ChatMediator mediator) throws IOException {
        this.username = username;
        this.chatMediator = mediator;
        this.chatWindow = new ChatWindow(this);
    }

    public String getUsername() {
        return username;
    }

    public void receivemessage(String message, String username) {
        chatWindow.displayMessage(username + ": " + message);
    }

    public void sendMessage(String message, String username) {
        chatMediator.sendMessage(message, this.username, username);
    }
}
