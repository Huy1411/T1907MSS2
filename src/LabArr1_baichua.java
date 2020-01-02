import java.util.Scanner;

public class LabArr1_baichua {
    public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.print("How many day tempratures? \n numDays = ");
        int numDays = console.nextInt();
        int[] temps = new int[numDays];

        int sum = 0;
        for (int i = 0; i < numDays; i++) {
            System.out.printf("Day "+ (i+1) + "'s high temp: \n Temps Day "+ (i+1) +" = ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        double average = (double)sum / numDays;


        int above = 0;
        for (int i=0; i<temps.length;i++){
            if(temps[i]> average) {
                above++;
            }
        }
        System.out.println("");
        System.out.println("Average = "+average);
        System.out.println(above + " Day above average");


    }
}
