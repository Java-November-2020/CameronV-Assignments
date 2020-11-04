import java.nio.charset.MalformedInputException;

public class ProjectTest {
    public static void main(String[] args) {
        
        Project newProject = new Project(new String[] {}, new String[] {});  
        System.out.println(newProject.name);
        System.out.println(newProject.description);

    }
}