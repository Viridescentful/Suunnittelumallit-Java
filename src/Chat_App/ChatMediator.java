package Chat_App;

import Chat_App.Interface.MediatorInterface;

import java.util.ArrayList;

public class ChatMediator implements MediatorInterface {
    private static ChatMediator instance;
    private ArrayList<User> users;

    private ChatMediator() {
        users = new ArrayList<>();
    }

    public static ChatMediator getInstance() {
        if (instance == null) {
            instance = new ChatMediator();
        }
        return instance;
    }

    @Override
    public void sendMessage(String message, String sender, String receiver) {
        for (User user : users) {
            if (user.getUsername().equals(receiver)) {
                user.receivemessage(message, sender);
                break;
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
