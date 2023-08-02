package Task_2;

/*      Создать коллекцию класса ArrayList со значениями имен всех студентов
        в группе
        С помощью Stream'ов:
        - Вернуть количество количество людей с вашим именем (вне
        зависимости от верхнего/нижнего регистра букв)
        - Выбрать все имена, начинающиеся на "а" (вне зависимости от
        верхнего/нижнего регистра букв)
        - Отсортировать и вернуть первый элемент коллекции или
        "Empty@, если коллекция пуста*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("Ivan");
        data.add("Nicholas");
        data.add("Artem");
        data.add("Aleksandr");
        data.add("Dima");
        data.add("Ilya");
        data.add("Simon");
        data.add("Victor");
        data.add("Alena");
        data.add("Danik");
        data.add("Kir");
        data.add("Arseny");
        data.add("Nastya");
        data.add("Arina");

     /*- Вернуть количество количество людей с вашим именем
      (вне зависимости от верхнего/нижнего регистра букв)*/
        Stream<String> stream = data.stream();
        /*long count = stream.filter("Ivan"::equals).count();
        System.out.println(count);*/


     /*- Выбрать все имена, начинающиеся на "а" (вне зависимости от
    верхнего/нижнего регистра букв)*/

       /* List<String> a = stream.map(String::toLowerCase).filter(s -> s.startsWith("a")).toList();
        System.out.println(a);*/

    /*- Отсортировать и вернуть первый элемент коллекции или
        "Empty@, если коллекция пуста**/

        String result = stream.sorted().findAny().orElse("Empty");
        System.out.println(result);
    }
}
