import java.io.File;

public class Main {
    public static void main(String[] args) {

        Person person = JsonDeseliarizator.loadFromJSON(new File("index.json"));
        System.out.println(person);
    }

}
