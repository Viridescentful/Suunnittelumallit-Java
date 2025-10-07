package Chat_App.Interface;

import Chat_App.User;

public interface MediatorInterface {
    void sendMessage(String message, String sender, String receiver);
    void addUser(User user);
}
