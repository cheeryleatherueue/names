import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<String> result = names.stream() 
                .filter(name -> name.startsWith("E")) 
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
