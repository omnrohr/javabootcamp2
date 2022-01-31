package com.company.contacts;

import com.company.contacts.models.Contact;
import com.company.contacts.models.ContactManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;

import java.util.Scanner;


public class Main {
    static ContactManager manager = new ContactManager();

    public static void main(String[] args) {

        manageContacts();

        try {
            loadContacts("D:\\javabootcamp2\\exceptions\\src\\com\\company\\contacts\\contacts.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Contacts loaded successfully");
        }

        System.out.println(manager);

//
//    try {
//        manager.addContact(0,new Contact("Ryan", "6135012424", "11/11/1992"));
//        manager.addContact(1,new Contact("Gio", "6477092344", "11/11/1993"));
//        manager.addContact(2,new Contact("Thomas", "8192256979", "11/11/1994"));
//            Contact contact = new Contact("name", "123456789","08/19/1980");
//            Contact newContact = new Contact(contact);
//            contact.setBirthDate("01/01/2000");
//            System.out.println(contact.getAge());
//            newContact.setName("new name");
//            newContact.setPhoneNumber("010010001");
//            newContact.setBirthDate("01/01/1990");
//            System.out.println(newContact);
//        System.out.println(manager);
//            } catch (ParseException e){
//            System.out.println(e.getMessage());
//            }finally {
//                System.out.println("completed");
//            }
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
    public static void manageContacts(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Please select one of following.\n\ta) to add contact.\n\tb) to remove contact.\n\tc) to exit.");
            System.out.print("Please enter your choice: ");
            String response = scan.nextLine();

            if (response.equalsIgnoreCase("c"))break;

            switch (response){
                case "a": {
                    System.out.print("please enter the name: ");
                    String name = scan.nextLine();

                    System.out.print("please enter the phone Number: ");
                    String phoneNumber = scan.nextLine();

                    System.out.print("Please enter the birth Date: ");
                    String birthDate = scan.nextLine();

                    if (name.isBlank()||phoneNumber.isBlank()||birthDate.isBlank()||
                            name==null||birthDate==null||birthDate==null||phoneNumber.length()<9){
                        System.out.println("\nnone of requested info can be empty or phone number is less than 9 characters\n");
                        continue;
                        }else {
                        try {
                             manager.addContact(new Contact(name,phoneNumber,birthDate));
                            }catch (ParseException e){
                                System.out.println(e.getMessage());
                            }finally {
                                System.out.println("\nContact added successfully.\n");
                                System.out.println(manager.searchContact(name));
                                break;
                            }
                        }
                }
                case "b":{
                    System.out.print("\nwho would you like to remove? ");
                    String name = scan.nextLine();
                    manager.removeContact(name);
                    System.out.println("removed successfully\n"+ manager);
                    break;
                }
            }
        }scan.close();
    }


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
    public static void loadContacts(String fileName) throws FileNotFoundException{
        FileInputStream load = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(load);
        while (scanFile.hasNextLine()){
            try {
                Contact contact = new Contact(scanFile.next(),scanFile.next(), scanFile.next());
                manager.addContact(contact);
            }catch (ParseException e){
                System.out.println(e.getMessage());
            }
        }scanFile.close();
    }
}