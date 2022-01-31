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

    public void addContact(int index, Contact contact){
        contacts.add(index, new Contact(contact));
    }

    public void removeContact(String name){
        for (int i = 0; i < contacts.size()-1; i++) {
            if (contacts.get(i).getName().equals(name)){
                contacts.remove(i);
            }
        }
    }
    public String toString(){
        String temp = "";
        for (int i = 0; i < contacts.size(); i++) {
            temp += contacts.get(i).toString();
            temp += "\n\n";
        }return temp;
    }
}
