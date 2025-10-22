package Generic;


public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};

        System.out.println("Mảng số nguyên:");
        Generic.Util.printArray(intArray);

        System.out.println("Mảng chuỗi:");
        Generic.Util.printArray(stringArray);
    }
}