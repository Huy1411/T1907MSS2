import java.util.ArrayList;
import java.util.Scanner;

public class book {
    public static book obj;
    private String ID;
    private String name;
    private String category;
    private int amount;
    private static Scanner scanner = new Scanner(System.in);


    public book(String ID, String name, String category, int amount) {
        this.ID = ID;
        this.name = name;
        this.category = category;
        this.amount = amount;
    }

    public book() {

    }



    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    private static ArrayList<book> book = new ArrayList<book>();

    static void addBook(String id, String name, String category, int amount) {
        book.add(new book(id, name, category, amount));
    }

    public static void displaybookList() {
        book obj = new book();
        obj.addBook("01", "Đắc Nhân Tâm", "Triết Lý", 10);
        obj.addBook("02", "Harry Potter", "Phiêu Lưu", 10);
        obj.addBook("03", "Star War", "Hành Động", 10);
        System.out.println("   Book List");
        System.out.println("-----------------");
        System.out.println("You have " + book.size() + " book");
        for (int i = 0; i < book.size(); ++i) {
            System.out.println("Book " + (i + 1) + ": ");
            System.out.println("ID: " + book.get(i).getID()
                    + "--- Tên : " + book.get(i).getName()
                    + "--- Thể loại: " + book.get(i).getCategory()
                    + "--- Số lượng: " + book.get(i).getAmount()
                    + "---");
        }
    }

    public static int findBook(String ID) {
        for (int i = 0; i < book.size(); i++) {
            book check = book.get(i);
            if (check.getID().equals(ID)) {
                return 1;
            }
        }
        return -1;
    }

    public static book query(String ID) {
        int position = findBook(ID);
        if (position > 0) {
            return book.get(position);
        }
        return null;
    }

    public static void queryBook() {
        System.out.println("Tìm kiếm theo ID: ");
        String ID = scanner.nextLine();
        book existingContact = query(ID);
        if (existingContact == null) {
            System.out.println("Không có sách nào");
            return;
        }
        System.out.println("ID: " + existingContact.getID()
                + "--- Tên: " + existingContact.getName()
                + "--- Thể loại: " + existingContact.getCategory()
                + "--- Só lượng: " + existingContact.getAmount()
                + "---");
    }
    public static void removeBook(String move) {
        book.remove(move);
    }
    public static boolean searchBook(String move) {
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).equals(move)){
                return true;
            }
        }
        return false;
    }
    public static void borrowBook(){
        System.out.println("Mời bạn nhập tên sách bạn muốn mượn");
        String borrow = scanner.nextLine();
        Boolean has = searchBook(borrow);
        if (has) {
            removeBook(borrow);
            System.out.println("Sách bạn đã mượn\n" + borrow);
            System.out.println("Số lượng sách còn lại\n");
            displaybookList();
        } else {
            System.out.println("Không có sách nào");
        }
    }


}
