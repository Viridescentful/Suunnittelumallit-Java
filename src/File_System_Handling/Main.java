package File_System_Handling;

import File_System_Handling.Classes.Directory;
import File_System_Handling.Classes.File;
import File_System_Handling.Classes.SearchVisitor;
import File_System_Handling.Classes.SizeCalculatorVisitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory important = new Directory("ImportantFiles");
        File file1 = new File("worstgradingpapers.txt", 2, FileTypes.TEXT);
        File file2 = new File("schoolphoto.jpg", 5, FileTypes.IMAGE);
        File file3 = new File("kitchen.txt", 1, FileTypes.TEXT);
        Directory compressed = new Directory("Compressed");
        File file4 = new File("verylegaldocuments.zip", 10, FileTypes.ZIP);

        important.add(file1);
        important.add(file2);
        important.add(compressed);
        compressed.add(file3);
        compressed.add(file4);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        important.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " MB");

        SearchVisitor txtSearch = new SearchVisitor(f -> f.getType() == FileTypes.TEXT);
        important.accept(txtSearch);
        List<File> txtFiles = txtSearch.getMatchingFiles();

        System.out.println("TEXT files:");
        for (File f : txtFiles) {
            System.out.println("- " + f.getName() + " (" + f.getSizeMB() + " MB)");
        }

        SearchVisitor imgSearch = new SearchVisitor(f -> f.getType() == FileTypes.IMAGE);
        important.accept(imgSearch);
        List<File> imgFiles = imgSearch.getMatchingFiles();

        System.out.println("IMAGE files:");
        for (File f : imgFiles) {
            System.out.println("- " + f.getName() + " (" + f.getSizeMB() + " MB)");
        }
    }
}
