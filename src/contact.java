import java.util.ArrayList;

public class contact {
    private String name;
    private String phone;

    public contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public contact() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    private static ArrayList<contact> contact = new ArrayList<contact>();

    public void addContact(String name, String phone) {
        contact.add(new contact(name, phone));
    }

    public void displayList() {
        System.out.println("You have " + contact.size() + " contact");
        for (int i = 0; i < contact.size(); ++i) {
            System.out.println("Contact " + (i + 1) + ": ");
            System.out.println("Name: " + contact.get(i).getName());
            System.out.println("Phone: "+ contact.get(i).getPhone());
        }
    }
    public static void main(String[] args) {

        System.out.println("   Contact List");
        System.out.println("-----------------");

        contact obj = new contact();
        obj.addContact("Titanic", "123");
        obj.addContact("Spiderman", "123");
        obj.addContact("Batman", "123");
        obj.addContact("wonder Woman", "123");

        obj.displayList();
    }
}



