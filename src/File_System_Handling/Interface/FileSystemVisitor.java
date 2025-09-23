package File_System_Handling.Interface;

import File_System_Handling.Classes.Directory;
import File_System_Handling.Classes.File;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory directory);
}
