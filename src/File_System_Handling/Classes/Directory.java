package File_System_Handling.Classes;

import File_System_Handling.Interface.FileSystemElement;
import File_System_Handling.Interface.FileSystemVisitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private final String name;
    private final List<FileSystemElement> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemElement element) {
        children.add(element);
    }

    public String getName() {
        return name;
    }

    public List<FileSystemElement> getChildren() {
        return children;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FileSystemElement child : children) {
            child.accept(visitor);
        }
    }
}
