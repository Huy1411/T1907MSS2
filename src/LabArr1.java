import java.util.Scanner;


public class LabArr1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập số ngày: n =  ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhiệt độ ngày thứ [%d]: ", i + 1);
            arr[i] = s.nextInt();
        }
        double average = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum = sum + arr[i];
            average = sum / arr.length;
        }
        System.out.println("Nhiệt độ trung bình = " + average);

        int min = arr[0];
        int max = arr[0];
        int x = 0, y = 0;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
                x = i + 1;
            }
            if (arr[i] > max) {
                max = arr[i];
                y = i + 1;
            }
        }
        System.out.println("Ngày thứ " + x + " có nhiệt độ cao nhất là " + max);
        System.out.println("Ngày thứ " + y + " có nhiệt độ thấp nhát là " + min);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.println("Ngày thứ " + (i + 1) + " có nhiệt độ cao hơn nhiệt độ trung bình.");
            }
        }
        int above = 0;
        for (int i =0; i<arr.length;++i){
            if (arr[i]>average){
                above++;
            }
        }
        System.out.println(above + " ngày có nhiệt độ cao hơn nhiệt độ trung bình.");
    }
}
