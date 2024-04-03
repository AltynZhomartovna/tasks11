interface MyFunction<T> {
    T apply(int index);
}
public class fillling {
    public static <T> void fill(T[] objects, MyFunction<? extends T> function) {
        for(int i = 0; i < objects.length; i++) {
            objects[i] = function.apply(i);
        }
    }
    public static void main(String[] args) {
        Integer[] squares = new Integer[100];
        fill(squares, integer -> integer * integer); // Fill the array with squares
        // Print the contents of the squares array
        for (int i = 0; i < squares.length; i++) {
            System.out.print( squares[i]+" ");
        }
    }

}
