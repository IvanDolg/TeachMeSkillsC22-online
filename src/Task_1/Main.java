package Task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();
        data.add(14);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(17);
        data.add(30);
        data.add(7);
        data.add(5);
        data.add(6);
        data.add(4);
        data.add(10);
        data.add(6);

        Stream<Integer> stream = data.stream();

        //- Удалить дубликаты

        /*List<Integer> integers = stream.distinct().toList();
        System.out.println(integers);*/

        //- Вывести все четные элементы в диапазоне от 7 до 17
        //(включительно)

        /*List<Integer> integer = stream.filter(i -> i % 2 == 0).filter(i-> i >= 7  && i <= 17).toList();
        System.out.println(integer);*/

        //Каждый элемент умножить на 2
        /*List<Integer> integers = stream.map(i -> i * 2).toList();
        System.out.println(integers);*/

       // - Отсортировать и вывести на экран первых 4 элемента
        /*List<Integer> integers = stream.sorted().limit(4).toList();
        System.out.println(integers);*/

        // - Вывести количество элементов в стриме
       /*long count = stream.count();
        System.out.println(count);*/

        // - Вывести среднее арифметическое всех чисел в стриме
        OptionalDouble average = stream.mapToDouble(Integer::doubleValue).average();
        double result = average.getAsDouble();
        System.out.println(result);
    }
}
