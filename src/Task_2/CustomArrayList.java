package Task_2;

import java.util.Arrays;

public class CustomArrayList <T>{
    private final int defaultSize = 10;
    private T[] elements;
    private int size;

    public CustomArrayList(){
        this.elements = (T[]) new Object[defaultSize];
    }
    public CustomArrayList(int newDimension){
        this.elements = (T[]) new Object[newDimension];
    }
    public void add(T element){
        if (size == elements.length){
            elements = Arrays.copyOf(this.elements, this.elements.length + defaultSize);
        }
        elements[size++] = element;
    }
    public boolean remove(T element){
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)){
                for (int j = 0; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                    return true;
                }
            }
        }
        if (element == null){
            return false;
        }
        return false;
    }
    public  T get(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return elements[index];
    }

    // this method does not work correctly
    public boolean contains(T element){
        for (T value : elements){
            if (value != null && value.equals(element)){
                return true;
            }
        }
        return false;
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public static void main(String[] args) {
        CustomArrayList<Integer> costomList = new CustomArrayList<>();
        costomList.add(1);
        costomList.add(2);
        costomList.add(3);
        costomList.add(4);
        costomList.add(5);

        System.out.println(costomList.get(0));
        System.out.println(costomList.get(1));
        System.out.println(costomList.get(2));
        System.out.println(costomList.get(3));
        System.out.println(costomList.get(4) + "\n");

        costomList.remove(3);

        // this method does not work correctly
        System.out.println(costomList.contains(0));
        System.out.println(costomList.contains(1));
        System.out.println(costomList.contains(2));
        System.out.println(costomList.contains(3));
        System.out.println(costomList.contains(4) + "\n");

        costomList.clear();
        System.out.println(costomList.size);
    }
}
