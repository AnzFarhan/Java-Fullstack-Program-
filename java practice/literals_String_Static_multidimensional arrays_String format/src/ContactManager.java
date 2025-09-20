public class ContactManager {
    private String name;
    private String phoneNumber;
    private String emailAddress;

    public ContactManager(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String toString() {
        return name + " : " + phoneNumber + " : " + emailAddress;
    }
}
