package Chat_App;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ChatWindow {
    private Scene chatScene;
    private TextArea chatArea;
    private Button sendButton;
    private TextField messageField;
    private TextField recipientField;
    private User user;

    public ChatWindow(User user) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Resources/ChatWindow.fxml")));
        this.chatScene = new Scene(root);

        Stage stage = new Stage();
        stage.setTitle("Chat - " + user.getUsername());
        stage.setResizable(false);
        stage.setScene(chatScene);
        stage.show();

        this.chatArea = (TextArea) chatScene.lookup("#chatbox");
        this.sendButton = (Button) chatScene.lookup("#postbutton");
        this.messageField = (TextField) chatScene.lookup("#messagefield");
        this.recipientField = (TextField) chatScene.lookup("#userfield");

        sendButton.setOnAction(event -> {
            String message = messageField.getText();
            String recipient = recipientField.getText();
            if (!message.isEmpty() && !recipient.isEmpty()) {
                displayMessage("To " + recipient + ": " + message);
                user.sendMessage(message, recipient);
                messageField.clear();
            }
        });
    }

    public void displayMessage(String message) {
        chatArea.appendText(message + "\n");
    }
}
