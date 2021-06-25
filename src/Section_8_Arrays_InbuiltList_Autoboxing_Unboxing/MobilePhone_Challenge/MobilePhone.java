package Section_8_Arrays_InbuiltList_Autoboxing_Unboxing.MobilePhone_Challenge;

import Section_8_Arrays_InbuiltList_Autoboxing_Unboxing.MobilePhone_Challenge.Contact;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if ((findContact(contact) == -1)) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition >= 0) {
            myContacts.set(foundPosition, newContact);
            return true;
        }
        else if (findContact(newContact.getName()) != -1) {
            return false;
        }
        else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        if (!(findContact(contact) < 0)) {
            myContacts.remove(contact);
            return true;
        } else {
            return false;
        }
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String str) {
        for(int i = 0; i < this.myContacts.size();i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(str)){
                return i;
            }
        }
        return -1;
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
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println((findContact(contact)+1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
