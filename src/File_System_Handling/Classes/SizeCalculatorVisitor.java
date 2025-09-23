package File_System_Handling.Classes;

import File_System_Handling.Interface.FileSystemVisitor;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSizeMB();
    }

    @Override
    public void visit(Directory directory) {

    }

    public int getTotalSize() {
        return totalSize;
    }
}