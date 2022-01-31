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
    private Date currentTime = new Date(System.currentTimeMillis());


    public Contact(String name, String phoneNumber, String birthDate) throws ParseException{
        if (name.isBlank()|| name==null){
            throw new IllegalArgumentException("Name can not be null/blank");
        }
        this.name = name;
        if (phoneNumber.length() < 9 || phoneNumber.isBlank()){
            throw new IllegalArgumentException("Minnsing numbers, please checkout.");
        }
        this.phoneNumber = phoneNumber;
        if (birthDate.isBlank()||birthDate== null){
            throw new IllegalArgumentException("birthdate cannot be null/blank");
        }
        this.birthDate = birthDate;
        System.out.println(currentTime);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(false);
        long difference = new Date().getTime() - sdf.parse(birthDate).getTime();
        int age = (int)(TimeUnit.MILLISECONDS.toDays(difference)/365);
        this.age = age;

//        try {
////            Date birthYear = sdf.parse(birthDate); //convert String to actual date.
////            long toMilli = birthYear.getTime();// convert date to milliseconds since 1970;
//            long difference = new Date().getTime() - sdf.parse(birthDate).getTime(); //in one line
//
//            int age = (int)(TimeUnit.MILLISECONDS.toDays(difference)/365); //convert to years.
//            this.age = age;
//        } catch (ParseException e){
//            System.out.println(e.getMessage());
//        }
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
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }
}
