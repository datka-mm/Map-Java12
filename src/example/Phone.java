package example;

import java.util.HashMap;
import java.util.Map;

public class Phone {

    private Map<String, String> contacts;

    public Phone(Map<String, String> contacts) {
        this.contacts = contacts;
    }

    public String addContact(String name, String phoneNumber) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, phoneNumber);
            return "Contact with name: " + name + " saved";
        } else {
            return "Contact with name: " + name + " exist";
        }
    }

    public Map<String, String> getContact(String key) {
        Map<String, String> contact = new HashMap<>();
        for (String name : contacts.keySet()) {
            if (name.equals(key)) {
                contact.put(name, contacts.get(name));// key = Nurtaazim  value = 0700000000
                return contact;
            }
        }
        return contact;
    }

    public void removeContact(String name) {
        String value = contacts.remove(name);
        System.out.println("value is " + value);
    }

    public Map<String, String> getContacts() {
        return contacts;
    }

}
