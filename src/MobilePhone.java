import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if ((findContact(contact) < 0)) {
            myContacts.add(contact);
            System.out.println(contact.getName() + ", was added to the My Contact Successfully!!!");
            return true;
        } else {
            System.out.println(contact.getName() + ", was already added!!!");
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition >= 0) {
            myContacts.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName() + ".");
            return true;
        } else {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (!(findContact(contact) < 0)) {
            myContacts.remove(contact);
            System.out.println(contact.getName() + ", was deleted successfully.");
            return true;
        } else {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String str) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(str)) {
                System.out.println("Contact number of " + contact.getName() + ": " + findContact(contact)+1);
                return findContact(contact);
            }
        }
        return  -1;
    }

    public Contact queryContact(String str) {
        int contactPosition = findContact(str);
        if (!(contactPosition < 0)) {
            return myContacts.get(contactPosition);
        } else {
            return null;
        }
    }

    public void printContacts() {
        for (Contact contact : myContacts) {
            System.out.println((findContact(contact)+1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
