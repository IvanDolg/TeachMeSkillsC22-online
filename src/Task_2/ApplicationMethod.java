package Task_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ApplicationMethod {
    List<String> data = Arrays.asList("Ivan", "Nicholas", "Artem", "Aleksandr", "Dima", "Ilya", "Simon",
            "Victor", "Alena", "Danik", "Kir", "Arseny", "Nastya", "Arina");

    public void getNumberOfMatches(){
        Stream<String> stream = data.stream();
        long count = stream.filter("Ivan"::equals).count();
        System.out.println(count);
    }
    public void getNamesByCondition(){
        Stream<String> stream = data.stream();
        List<String> a = stream.map(String::toLowerCase).filter(s -> s.startsWith("a")).toList();
        System.out.println(a);
    }
    public void sort(){
        Stream<String> stream = data.stream();
        String result = stream.sorted().findAny().orElse("Empty");
        System.out.println(result);
    }
}
