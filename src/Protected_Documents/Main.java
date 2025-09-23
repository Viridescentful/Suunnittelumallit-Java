package Protected_Documents;

import Protected_Documents.Classes.Document;
import Protected_Documents.Classes.User;

public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.addDocument(new Document("ProjectPlan", "This is the project plan content."));

        User newadmin = new User("Alice", "admin");
        User newuser = new User("Alex", "user");

        System.out.println(proxy.getContent("ProjectPlan", newadmin));

        System.out.println(proxy.getDateCreated("ProjectPlan", newuser));

        System.out.println(proxy.getContent("ProjectPlan", newuser));;
    }
}
