import java.util.Scanner;

public class Lab3_1_3_Area_Perimeter {
    public static void main(String[] args) {
        float width, length;
        Scanner s = new Scanner(System.in);
        System.out.print("Width:");
        width = s.nextInt();
        System.out.print("Length:");
        length = s.nextInt();
        Lab3_1_3_Rectangle b = new Lab3_1_3_Rectangle(width, length);
        System.out.println("Perimeter" + b.getPerimeter());
        System.out.println("Area" + b.getArea());
        System.out.println(b.toString());

    }
}
