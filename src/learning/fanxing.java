package learning;

public class fanxing {
    public static void main(String []arg){
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("整型数组为：");
        printArray(intArray);

        System.out.println("字符数组为：");
        printArray(charArray);

        System.out.println("浮点型数组为：");
        printArray(doubleArray);


    }
    public static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.printf("%s",element);
        }
        System.out.println();
    }
}
