import java.util.Scanner;

public class Lab3_1_5_TheInvoiceItem {
    public static void main(String[] args) {
        String id, desc;
        int qty;
        double unitPrice;

        Scanner s = new Scanner(System.in);
        System.out.print("ID:");
        id = s.next();
        System.out.print("Desc:");
        desc = s.next();
        System.out.print("Qty:");
        qty = s.nextInt();
        System.out.print("UnitPrice:");
        unitPrice = s.nextDouble();

        Lab3_1_5_InvoiceItem d =  new Lab3_1_5_InvoiceItem(id,desc,qty,unitPrice);
        System.out.println("Total:" + d.gettotal());
        System.out.println(d.toString());
    }
}
