package File_System_Handling.Interface;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
