package Protected_Documents.Classes;

import java.util.HashMap;

public class Library {
    private HashMap<String, Document> library;

    public Library() {
        this.library = new HashMap<>();;
    }

    public void addDocument(Document doc) {
        library.put(doc.getName(), doc);
    }

    public Document getDocument(String name) {
        return library.get(name);
    }
}
