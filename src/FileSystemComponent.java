import java.util.ArrayList;
import java.util.List;

// Common interface for files and directories

interface FileSystemComponent {
    void showDetails();
}
// Class for files
class File implements FileSystemComponent {
    private String name;
    public File(String name) {
        this.name = name;
    }
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
// Class for directories

class Directory implements FileSystemComponent {
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    public void showDetails() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}