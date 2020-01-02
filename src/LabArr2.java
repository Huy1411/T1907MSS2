import java.util.Scanner;

public class LabArr2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a;
        int n;
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        /*khởi tạo mảng
         */
        a = new int[n];
        nhap(a,n);
        xuat(a,n);

        System.out.println("AVG = " + getAverage(a,n) );
    }
    public static void nhap(int a[],int n){
        System.out.println("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();
    }
    public static void xuat(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

    public static double getAverage(int a[], int n){
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double average = (double)sum / n;
        return average;
    }


}
