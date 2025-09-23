package File_System_Handling.Classes;

import File_System_Handling.Interface.FileSystemVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchVisitor implements FileSystemVisitor {
    private final Predicate<File> criterion;
    private final List<File> matchingFiles = new ArrayList<>();

    public SearchVisitor(Predicate<File> criterion) {
        this.criterion = criterion;
    }

    @Override
    public void visit(File file) {
        if (criterion.test(file)) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {

    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }
}
