import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        startLibrary();
        printActions();
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("\n Shutting down ...");
                    quit = true;
                    break;
                case 1:
                    LoginLibrary.Login();
                    break;
                case 2:
                    book.obj.displaybookList();
                    break;
                case 3:
                    book.queryBook();
                    break;
                case 4:
                    book.borrowBook();
                    break;


            }
        }
    }


    private static void startLibrary() {
        System.out.println("Chào mừng đến với Thư Viện");
    }



    private static void printActions() {
        System.out.println("\nSố việc cần làm:  \n");
        System.out.println("1 - Đăng nhập  \n"
                + "2 - Xem sách hiện có trong thư viện  \n"
                + "3 - Tìm kiếm sách  \n"
                + "4 - Mượn sách  \n");
        System.out.println("Chọn công việc: ");
    }
}