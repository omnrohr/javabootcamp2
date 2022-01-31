package com.company.TestContacts.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestContact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public TestContact(String name, String phoneNumber, String birthDate) throws ParseException{
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy"); // instantiate simple formatter.
        formatter.setLenient(false);// force the formatter to parse the date format as given.
        Date parcedBirthDate = formatter.parse(birthDate); //git the birthdate from birthdate string.
        long toDayInMilli = new Date().getTime();
        long birhtDateInMilli = parcedBirthDate.getTime();
        long different = new Date().getTime() - formatter.parse(birthDate).getTime();
        this.age = (int) (TimeUnit.MILLISECONDS.toDays(different)/365);
    }

    public TestContact(TestContact source){
        this.name= source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age= source.age;
    }

    public int getAge(){
        return this.age;
    }

}
