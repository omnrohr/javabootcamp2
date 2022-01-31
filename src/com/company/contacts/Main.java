package com.company.contacts;

import com.company.contacts.models.Contact;

import java.text.ParseException;


public class Main {
    public static void main(String[] args) {
        try {
            Contact contact = new Contact("name", "123456789","08/19/1980");
            Contact newContact = new Contact(contact);
            contact.setBirthDate("01/01/2000");
            System.out.println(contact.getAge());
            newContact.setName("new name");
            newContact.setPhoneNumber("010010001");
            newContact.setBirthDate("01/01/1990");
            System.out.println(newContact);
            } catch (ParseException e){
            System.out.println(e.getMessage());
            }finally {
                System.out.println("completed");
            }


    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */

}
