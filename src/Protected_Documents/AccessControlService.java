package Protected_Documents;

import Protected_Documents.Classes.User;

public class AccessControlService {
    public boolean hasAccess(User user) {
        return "admin".equals(user.getRole());
    }
}
