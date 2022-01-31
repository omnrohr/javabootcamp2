package com.company.contacts.models;

import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<Contact>();
    }

    public Contact getContact(int index){
        return new Contact(contacts.get(index));
    }

    public void setContacts(Contact contact, int index){
        contacts.set(index,new Contact(contact));
    }

    public void addContact(Contact contact){
        contacts.add(new Contact(contact));
    }

    public void removeContact(String name){
        if (contacts.isEmpty()){
            throw new IllegalStateException("The contact list is empty!");
        }
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)){
                contacts.remove(i);
            }
        }
    }
    public String toString(){
        if(contacts.isEmpty()) return "\ncontact list is empty\n";
        String temp = "";
        for (int i = 0; i < contacts.size(); i++) {
            temp += contacts.get(i).toString();
            temp += "\n\n";
        }return temp;
    }
    public String searchContact(String name){
        if (contacts.isEmpty()){
            throw new IllegalStateException("contacts is empty.");
        }
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name))
                return contacts.get(i).toString();
        }return null;
    }
}
