public class multiple {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[5] = 10; // This will throw an ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length()); // This will throw a NullPointerException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception");
        }
    }
}
