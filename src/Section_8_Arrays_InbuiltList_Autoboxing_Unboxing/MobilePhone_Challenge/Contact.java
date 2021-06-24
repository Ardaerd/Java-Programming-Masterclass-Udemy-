package Section_8_Arrays_InbuiltList_Autoboxing_Unboxing.MobilePhone_Challenge;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name,phoneNumber);
        return newContact;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
