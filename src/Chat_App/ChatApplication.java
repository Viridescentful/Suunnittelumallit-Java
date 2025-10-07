package Chat_App;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class ChatApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        ChatMediator mediator = ChatMediator.getInstance();

        User user1 = new User("Alice", mediator);
        User user2 = new User("Bob", mediator);
        User user3 = new User("Charlie", mediator);

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
    }
}
