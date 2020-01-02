import java.util.Scanner;

public class Lab4_TestATM {

    public static void main(String[] args) {
        System.out.println("Welcome to ATM!");
        Lab4_ATM acc1 = new Lab4_ATM();
        acc1.setNumber_card("TopMo");
        acc1.setPassword("1411");
        acc1.setBalance(8000);
        acc1.setAmount(0);
        String a = acc1.getNumber_card();
        String b = acc1.getPassword();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number card:");
        a = input.nextLine();
        System.out.println("Enter password:");
        b = input.nextLine();


        if (a.equals(a) && b.equals(b)) {
            System.out.printf("Login success");
            System.out.println("\n So du tai khoan: Balance = " + acc1.getBalance());


            //Nop Tien:
            int deposit;
            System.out.println("\n So tien nop: Amount");
            deposit = input.nextInt();
            acc1.deposit(deposit);
            System.out.println("So du sau khi nop: Balance = " + acc1.deposit(deposit));


            //Rut Tien:
            int withdrawal;
            System.out.println("\n So tien rut: Amount = ");
            withdrawal = input.nextInt();
            acc1.withdrawal(withdrawal);
            System.out.println("So du sau khi rut: Balance = " + acc1.withdrawal(withdrawal));


            //Chuyen Khoan:
            int tranfer;
            System.out.println("\n Nhap so tk can chuyen: Number_card =");
            int acc2 = input.nextInt();
            System.out.println("\n So tien chuyen: Amount = ");
            tranfer = input.nextInt();
            acc1.tranferTo(tranfer);
            System.out.println("So du con lai: Balance = " + acc1.tranferTo(tranfer));
        } else {
            System.out.printf("Login fail");
        }

    }
}
