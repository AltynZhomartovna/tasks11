public class Vector {
    public static void main(String[] args) {
        Vector[] vectors = Vector.generate(2); // generate 2 vectors
        System.out.println(vectors[0]); // Print the first vector
        System.out.println(vectors[1]); // Print the second vector
        // Access methods directly on the first vector
        System.out.println("Length of vector 1: " + vectors[0].length());
        System.out.println("Scalar product of vectors: " + vectors[0].scalarProduct(vectors[1]));
        System.out.println("Cross product of vectors: " + vectors[0].crossProduct(vectors[1]));
        System.out.println("Cosine between vectors: " + vectors[0].cos(vectors[1]));
        System.out.println("Sum of vectors: " + vectors[0].add(vectors[1]));
        System.out.println("Difference of vectors: " + vectors[0].subtract(vectors[1]));
    }

    // Три приватных поля
    private double x;
    private double y;
    private double z;
    // С тремя параметрами
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Длина вектора. Корень из суммы квадратов
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    // метод, вычисляющий скалярное произведение
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }
    // метод, вычисляющий векторное произведение
    public Vector crossProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }
    // Косинус между двумя векторами
    public double cos(Vector vector) {
        // Для вычисления длины и произведения используются
        //методы multiply и length
        return scalarProduct(vector) / (length() * vector.length());
    }
    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }
    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }
    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}