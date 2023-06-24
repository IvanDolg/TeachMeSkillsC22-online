package Task2;

public class Vector {
    private double x;
    private double y;
    private double z;

    // A constant containing a description of the vector.
    static String information = "This is a vector for a three-dimensional coordinate system";
    static int counter;
    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /* A static method that takes an integer N, and returns an array of random vectors of size N. */
    public static Vector[] staticMethod(int number) {
        Vector[] vectors = new Vector[number];
        for (int i = 0; i < number; i++) {
            vectors[i]= new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    /* The method that calculates the length of the vector. */
    public double vectorLength(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    /* A method that calculates the scalar product. */
    public double scalarProduct(Vector vector){
        return (x * vector.x) + (y * vector.y) + (z * vector.z);
    }

    /* Vector addition method. */
    public Vector additionOfVectors (Vector vector){
        return  new Vector(x + vector.x, y + vector.y, z + vector.z);
    }
    public Vector vectorDifference (Vector vector){
        return  new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    /* Vector comparison method. */
    public Vector vectorComparison(Vector vector){
        if (x > vector.x){
            System.out.println("The first element of the first vector is larger than the first element of the second vector");
        } else if (x < vector.x) {
            System.out.println("The first element of the second vector is larger than the first element of the first vector");
        } else if (x == vector.x){
            System.out.println("The first element of the first vector is equal to the first element of the second vector");
        }
        if (y > vector.y){
            System.out.println("The second element of the first vector is larger than the second element of the second vector");
        } else if (y < vector.y) {
            System.out.println("The second element of the second vector is larger than the second element of the first vector");
        } else if (y == vector.y){
            System.out.println("The second element of the first vector is equal to the second element of the second vector");
        } if (z > vector.z){
            System.out.println("The third element of the first vector is larger than the third element of the second vector");
        } else if (z < vector.z) {
            System.out.println("The third element of the second vector is larger than the third element of the first vector");
        } else if (z == vector.z){
            System.out.println("The third element of the first vector is equal to the third element of the second vector");
        }
        return vector;
    }

    /* A method for displaying information about a vector. */
    @Override
    public String toString() {
        counter++;
        return "--------------------------------" +
                "\nVector number: " + counter +
                "\n" + information + ", its coordinates:" +
                "\nx: " + this.x +
                "\ny: " + this.y +
                "\nz: " + this.z;
    }
}
