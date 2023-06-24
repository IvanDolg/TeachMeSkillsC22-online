package Task2;

public class Main {
    public static void main(String[] args) {
        Vector[] vectors = Vector.staticMethod(3);
        System.out.println(vectors[0]);
        System.out.println("Vector length: " + vectors[0].vectorLength());
        System.out.println(vectors[1]);
        System.out.println("Vector length: " + vectors[1].vectorLength());
        System.out.println(vectors[2]);
        System.out.println("Vector length: " + vectors[2].vectorLength());

        System.out.println("--------------------------------");
        System.out.println("Scalar product: " + vectors[0].scalarProduct(vectors[1]));
        System.out.println("Scalar product: " + vectors[1].scalarProduct(vectors[2]));

        System.out.println("\nVector addition \n" + vectors[0].additionOfVectors(vectors[1]));
        System.out.println("\nVector addition \n" + vectors[1].additionOfVectors(vectors[2]));

        System.out.println("\nVector difference \n" + vectors[0].vectorDifference(vectors[1]));
        System.out.println("\nVector difference \n" + vectors[1].vectorDifference(vectors[2]));

        System.out.println("--------------------------------");
        System.out.println("Vector comparison: \n");
        vectors[0].vectorComparison(vectors[1]);
        System.out.println("--------------------------------");
        System.out.println("Vector comparison: \n");
        vectors[1].vectorComparison(vectors[2]);
    }
}
