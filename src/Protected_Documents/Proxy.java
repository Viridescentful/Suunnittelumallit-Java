package Protected_Documents;

import Protected_Documents.Classes.Document;
import Protected_Documents.Classes.Library;
import Protected_Documents.Classes.User;

public class Proxy {
    private Library library;
    private AccessControlService accessControlService;

    public Proxy() {
        this.library = new Library();
        this.accessControlService = new AccessControlService();
    }

    public void addDocument(Document doc) {
        library.addDocument(doc);
    }

    public String getContent(String docName, User user) {
        if (accessControlService.hasAccess(user)) {
            Document chosendocument = library.getDocument(docName);
            if (chosendocument != null) {
                return chosendocument.getContent();
            } else {
                throw new RuntimeException("Document not found.");
            }
        } else {
            throw new RuntimeException("Access denied. You do not have permission to view the content.");
        }
    }

    public String getDateCreated(String docName, User user) {
        Document chosendocument = library.getDocument(docName);
        if (chosendocument != null) {
            return chosendocument.getDateCreated();
        } else {
            throw new RuntimeException("Document not found.");
        }
    }
}
