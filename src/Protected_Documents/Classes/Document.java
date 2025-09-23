package Protected_Documents.Classes;

public class Document {
    private String name;
    private String dateCreated;
    private String content;

    public Document(String identifier, String content) {
        this.name = identifier;
        this.dateCreated = java.time.LocalDate.now().toString();
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getContent() {
        return content;
    }
}
