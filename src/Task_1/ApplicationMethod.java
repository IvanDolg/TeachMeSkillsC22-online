package Task_1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class ApplicationMethod {
    List<Integer> data = Arrays.asList(14,2,3,4,5,17,30,7,5,6,4,10,6);
    public void removeDuplicates(){
    Stream<Integer> stream = data.stream();
    List<Integer> integer1 = stream.distinct().toList();
    System.out.println(integer1);
    }
    public void getAllEvenElements(){
        Stream<Integer> stream = data.stream();
        List<Integer> integer2 = stream.filter(i -> i % 2 == 0).filter(i-> i >= 7  && i <= 17).toList();
        System.out.println(integer2);
    }
    public void multiplyElements(){
        Stream<Integer> stream = data.stream();
        List<Integer> integer3 = stream.map(i -> i * 2).toList();
        System.out.println(integer3);
    }
    public void sort(){
        Stream<Integer> stream = data.stream();
        List<Integer> integer4 = stream.sorted().limit(4).toList();
        System.out.println(integer4);
    }
    public void getAmountOfElements(){
        Stream<Integer> stream = data.stream();
        long count = stream.count();
        System.out.println(count);
    }
    public void getArithmeticMean(){
        Stream<Integer> stream = data.stream();
        OptionalDouble average = stream.mapToDouble(Integer::doubleValue).average();
        double result = average.getAsDouble();
        System.out.println(result);
    }
}
