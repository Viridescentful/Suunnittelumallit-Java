package Book_Recommendation_System;

import Book_Recommendation_System.Classes.Book;
import Book_Recommendation_System.Classes.Recommendation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Book Recommendation System:");

        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Recommendation> recommendations = new ArrayList<Recommendation>();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "novel");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "novel");
        Book book3 = new Book("1984", "George Orwell", "dystopian");
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", "romance");
        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", "novel");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        Recommendation recommendation = new Recommendation("Novels");
        recommendation.addBook(book1);
        recommendation.addBook(book2);
        recommendation.addBook(book5);

        Recommendation recommendation2 = new Recommendation("Dystopian");
        recommendation2.addBook(book3);

        Recommendation recommendation3 = new Recommendation("Romance");
        recommendation3.addBook(book4);

        recommendations.add(recommendation);
        recommendations.add(recommendation2);
        recommendations.add(recommendation3);

        int choice = 0;

        Scanner scanner = new Scanner(System.in);

        while (choice != 4) {
            System.out.print("What would you like to do: (1) View All Books, (2) View Recommendations, (3) Make your own Recommendation, (4) Exit: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Viewing all books...");

                    for (Book book : books) {
                        System.out.println(book);
                    }

                    break;
                case 2:
                    System.out.println("Viewing recommendations...");

                    for (Recommendation rec : recommendations) {
                        System.out.println(rec);
                    }

                    break;
                case 3:
                    System.out.println("Making your own recommendation...");
                    System.out.println("Give the recommendation a title: ");
                    String title = scanner.next();

                    Recommendation userRecommendation = new Recommendation(title);

                    int subChoice = 0;

                    while (subChoice != 4) {
                        System.out.print("What would you like to do: (1) Add Book, (2) Copy Recommendations, (3) Replace Recommendations, (4) Done: ");

                        subChoice = Integer.parseInt(scanner.next());
                        switch (subChoice) {
                            case 1:
                                System.out.println("Adding book...");
                                System.out.println("Available books:");

                                for (Book book : books) {
                                    System.out.println((books.indexOf(book) + 1) + ". " + book);
                                }

                                System.out.print("Select a book to add by number: ");
                                int bookChoice = scanner.nextInt();

                                if (bookChoice > 0 && bookChoice <= books.size()) {
                                    userRecommendation.addBook(books.get(bookChoice - 1));
                                    System.out.println("Book added.");
                                } else {
                                    System.out.println("Invalid choice.");
                                }
                                break;
                            case 2:
                                System.out.println("Copying recommendations...");

                                System.out.println("Available recommendations:");

                                for (Recommendation rec : recommendations) {
                                    System.out.println((recommendations.indexOf(rec) + 1) + ". " + rec);
                                }

                                System.out.print("Select a recommendation to copy by number: ");
                                int recChoice = scanner.nextInt();

                                if (recChoice > 0 && recChoice <= recommendations.size()) {
                                    userRecommendation.copyOnRecommendations(recommendations.get(recChoice - 1).getRecommendations());
                                    System.out.println("Recommendations copied.");
                                } else {
                                    System.out.println("Invalid choice.");
                                }
                                break;
                            case 3:
                                System.out.println("Replacing recommendations...");

                                for (Recommendation rec : recommendations) {
                                    System.out.println((recommendations.indexOf(rec) + 1) + ". " + rec);
                                }

                                System.out.print("Select a recommendation to copy by number: ");
                                int recChoice2 = scanner.nextInt();

                                if (recChoice2 > 0 && recChoice2 <= recommendations.size()) {
                                    userRecommendation.replaceRecommendation(recommendations.get(recChoice2 - 1).getRecommendations());
                                    System.out.println("Recommendations replaced.");
                                } else {
                                    System.out.println("Invalid choice.");
                                }
                                break;

                            case 4:
                                System.out.println("Done making recommendation.");
                                System.out.println("Your Recommendation: ");
                                System.out.println(userRecommendation);
                                recommendations.add(userRecommendation);
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
