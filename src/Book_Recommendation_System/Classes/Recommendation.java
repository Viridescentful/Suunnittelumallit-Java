package Book_Recommendation_System.Classes;

import java.util.ArrayList;

public class Recommendation {
    private String title;
    private ArrayList<Book> recommendations;

    public Recommendation(String title) {
        this.title = title;
        this.recommendations = new ArrayList<>();
    }

    public ArrayList<Book> getRecommendations() {
        return recommendations;
    }

    public void addBook(Book book) {
        recommendations.add(book);
    }

    public void copyOnRecommendations(ArrayList<Book> recommendations) {
        for (Book book : recommendations) {
            try {
                Book copy = book.clone();
                this.recommendations.add(copy);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

    public void replaceRecommendation(ArrayList<Book> recommendations) {
        this.recommendations.clear();
        for (Book book : recommendations) {
            try {
                Book copy = book.clone();
                this.recommendations.add(copy);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recommendation Title: ").append(title).append("\nBooks:\n");

        for (Book book : recommendations) {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }
}
