import java.util.ArrayList;

public class ContactList {
    private String myNumber;
    private ArrayList<contact> myContact;

    public ContactList(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<contact>();
    }

    private int findContact(contact contact) {
        return this.myContact.indexOf(contact);
    }

    public boolean addContact(contact contact) {
        if (findContact(contact) > 0) {
            System.out.println("Contact is already");
            return false;
        }
        myContact.add(contact);
        return true;
    }

    public boolean updateContact(contact oldContact, contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println("Contact was not found");
            return false;
        }
        this.myContact.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + "was replaced with" + newContact.getName());
        return true;
    }

    public boolean removeContact(contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println("Contact was not found");
            return false;
        }
        this.myContact.remove(contact);
        System.out.println(contact.getName() + "was deleted");
        return true;
    }

    public int findContact(String contactName) {
        for (int i = 0; i < this.myContact.size(); ++i) {
            contact contact = myContact.get(i);
            if (contact.getName().equals(contactName)) {
                return 1;
            }
        }
        return -1;
    }
    public void printContact(){
        System.out.println("Contact List" + this.myNumber);
        for (int i = 0; i < this.myContact.size();++i){
            System.out.println((i+1) + myContact.get(i).getName() + "->" + myContact.get(i).getPhone());
        }
    }
    public contact queryContact(String name){
        int position = findContact(name);
        if (position>0){
            return this.myContact.get(position);
        }
        return null;
    }
    public String queryContact (contact contact){
        if(findContact(contact)>0){
            return  contact.getName();
        }
        return null;

    }

}
