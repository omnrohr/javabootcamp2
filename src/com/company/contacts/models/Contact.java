package com.company.contacts.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException{
        if (checkString(name)){
            throw new IllegalArgumentException("Name can not be null/blank");
        }
        this.name = name;
        if (checkPhoneNumber(phoneNumber)){
            throw new IllegalArgumentException("Minnsing numbers, please checkout.");
        }
        this.phoneNumber = phoneNumber;
        if (checkString(birthDate)){
            throw new IllegalArgumentException("birthdate cannot be null/blank");
        }
        this.birthDate = birthDate;
        this.age = calculateAge(birthDate);
    }

    public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkString(name)){
            throw new IllegalArgumentException("name can not be empty/black!");
        }
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (checkPhoneNumber(phoneNumber)){
            throw new IllegalArgumentException("Phone number can not be null/blank!");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws ParseException{
        this.birthDate = birthDate;
        setAge(calculateAge(birthDate));
    }

    public int getAge() {
        return age;
    }
    private void setAge(int age){
        this.age=age;
    }
    /**
     * Name: calculateAge
     * @param birthDate
     * @return age (int)
     * @throws ParseException
     *
     * Inside the function:
     *   1. Parses a date from the birthDate String
     *   2. Gets the current date
     *   3. Subtracts the difference and returns the age.
     *
     */
    public int calculateAge(String birthDate) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); // instantiate simple formatter.
        formatter.setLenient(false);// force the formatter to parse the date format as given.
        Date parcedBirthDate = formatter.parse(birthDate); //git the birthdate from birthdate string.
        long toDayInMilli = new Date().getTime();
        long birhtDateInMilli = parcedBirthDate.getTime();
        long different = new Date().getTime() - formatter.parse(birthDate).getTime();
        return  (int) (TimeUnit.MILLISECONDS.toDays(different)/365);
    }
    public String toString(){
        return "Name: " + name + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "Birth Date: " + birthDate + "\n" +
                "Age: " + age + " year old\n";
    }
//    public String inLineToString(){
//        return name + " " + phoneNumber + " " + birthDate + "\n";
//    }
    private boolean checkString(String name){
        return (name.isBlank()|| name==null);
    }
    private boolean checkPhoneNumber(String phoneNumber){
        return (phoneNumber.length() < 9 || phoneNumber.isBlank() || phoneNumber == null);
    }
}
