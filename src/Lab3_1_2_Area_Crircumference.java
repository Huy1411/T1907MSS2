import java.util.Scanner;

public class Lab3_1_2_Area_Crircumference {
    public static void main(String[] args) {
        double radius;
        Scanner s = new Scanner(System.in);
        System.out.print("Radius:");
        radius = s.nextInt();
        Lab3_1_2_Circle a = new Lab3_1_2_Circle(radius);
        System.out.println("Crircumference" + a.getCrircumference());
        System.out.println("Area" + a.getArea());
        System.out.println(a.toString());
    }
}

