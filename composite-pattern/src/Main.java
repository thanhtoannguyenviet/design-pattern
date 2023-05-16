import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileComponent fileComponent = new FileLeaf("bin",36);
        FileComponent fileComponent1 = new FileLeaf("etc",44);
        FileComponent fileComponent2 = new FileLeaf("opt",2);
        List<FileComponent> ls = Arrays.asList(fileComponent,fileComponent1,fileComponent2);
        FileComponent folder = new FolderComposite(ls);
        folder.showProperty();
        System.out.println("Total size:"+folder.totalSize());
    }
}