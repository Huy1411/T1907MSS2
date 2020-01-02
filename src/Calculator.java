import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int[] myintergers = initArray(5);
        // in ra cac gia tri trong myIntergers
        for (int i = 0; i < myintergers.length; ++i){
            System.out.println("Element " + i + " , tyed values was" + myintergers[i]);
        }
        System.out.println("Average is " + getAverage(myintergers));
    }

    /**
     * Tao mang
     * @param size kich co cua mang
     * @return mang gia tri
     */
    public static int [] initArray(int size){
        int [] values = new int [size];
        System.out.println("Enter" + size + "integer values.");
        for (int i = 0; i < size; ++i){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    /**
     * Tinh gia tri trung binh
     * @param array Mang can tinh gia tri
     * @return gia tri trung binh
     */
    public static double getAverage(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double)sum / (double)array.length;
        return average;
    }
}
