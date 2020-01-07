import java.util.Scanner;

public class MainContact {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactList contactList = new ContactList("0984121818");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\n Enter action: 6 to show avaiable actions");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\n Shutting down ...");
                    quit = true;
                    break;
                case 1:
                    contactList.printContact();
                    break;
                case 2:
                    addNewcontact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }
        }
    }

    private static void addNewcontact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Emter phone number");
        String phone = scanner.nextLine();

        contact contact = new contact(name, phone);
        if (contactList.addContact(contact)) {
            System.out.println("New contact added: name = " + name + " phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + "adready on contact list");
        }
    }

    private static void updateContact() {
        System.out.println("Enter exsiting contact name:");
        String name = scanner.nextLine();
        int existingContact = contactList.findContact(name);
        if (existingContact < 0) {
            System.out.println("Contact not foung");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newPhone = scanner.nextLine();
        contact contact = new contact(newName, newPhone);
        if (contactList.updateContact(contact, contact)) {
            System.out.println("Successfully update record");
        } else {
            System.out.println("Error updatung record");
        }
    }
    private static void removeContact(){
        System.out.println("Enter existing contact name; ");
        String name = scanner.nextLine();
        contact existingContact = contactList.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        if (contactList.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }else {
            System.out.println("Error deleting contact");
        }
    }
    private static void queryContact(){
        System.out.println("Enter existing contact name; ");
        String name = scanner.nextLine();
        contact existingContact = contactList.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name " + existingContact.getName() + "Phone Number is " + existingContact.getPhone());
    }

    private static void startPhone(){
        System.out.println("Starting Phone ...");
    }
    private static void printActions(){
        System.out.println("\nAvaiable action: \n press");
        System.out.println("0 - to shutdown \n"
                            + "1 - to print contacts \n"
                            + "2 - to add new contact \n"
                            + "3 - to update existing contact \n"
                            + "4 - to remove contact \n"
                            + "5 - query if an existing contact \n"
                            + "6 - to print  list avable actions");
        System.out.println("Choose your actions: ");
    }
}
