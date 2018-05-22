import java.io.File;

public class Main {
    public static void main(String[] args) {

        Person person =new JsonDeseliarizator.loadFromJSP(new File("index.jsp"));
        System.out.println(person);
    }

}
