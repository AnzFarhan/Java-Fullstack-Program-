public class contactManagerClass {
    //static variable for maximum contacts
    public static int maxContact = 100;
    public static ContactManager[] contacts = new ContactManager[maxContact]; //store the maxContact
    public static int  contactCount;

    //static method to initialize the array
    public static void initialize() {
        for(int i = 0; i < maxContact; i++) {
            contacts[i] = null;
        }
        contactCount = 0;
    }
    //static method to a new contact
    public static void addContact(String name, String phoneNumber, String email) {
        if (contactCount >= maxContact) {
            System.out.println("Cannot add more contacts. Maximum limit reached.");
            return;
        }
        contacts[contactCount++] = new ContactManager(name, phoneNumber, email);
        System.out.println("Contact '" + name + "' added successfully.");
    }

    public static String[] searchContact(String name) {
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                return new String[]{contacts[i].getPhoneNumber(), contacts[i].getEmailAddress()};
            }
        }
        return null; // Contact not found
    }
    // Static method to display all contacts
    public static void displayContacts() {
        if (contactCount == 0) {
            System.out.println("No contacts available.");
            return;
        }

    }

    public static void main(String[] args) {
        initialize(); // Initialize the contacts array

        addContact("Alice Smith", "555-1234", "alice@example.com");
        addContact("Bob Johnson", "555-5678", "bob@example.com");

        System.out.println("\nSearch for Alice:");
        String[] result = searchContact("Alice Smith");
        if (result != null) {
            System.out.println("Alice's Phone: " + result[0] + ", Email: " + result[1]);
        } else {
            System.out.println("Alice not found.");
        }

        System.out.println("\nAll Contacts:");
        displayContacts();
    }
}