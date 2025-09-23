package File_System_Handling.Classes;

import File_System_Handling.FileTypes;
import File_System_Handling.Interface.FileSystemElement;
import File_System_Handling.Interface.FileSystemVisitor;

public class File implements FileSystemElement {
    private final String name;
    private final FileTypes type;
    private final int sizeMB; // Size in megabytes

    public File(String name, int sizeMB, FileTypes type) {
        this.name = name;
        this.sizeMB = sizeMB;
        this.type = type;
    }

    public FileTypes getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getSizeMB() {
        return sizeMB;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
