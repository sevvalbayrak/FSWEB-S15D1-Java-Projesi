package com.workintech.phone.main;

import com.workintech.phone.model.Contact;
import com.workintech.phone.model.MobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("123456");
        Contact ahmet = new Contact("Ahmet", "123789");
        phone.addNewContact(new Contact("Ayşe", "123852"));
        phone.addNewContact(ahmet);
        phone.addNewContact(new Contact("Cem", "123741"));
        phone.addNewContact(new Contact("Ali", "123741"));
        phone.addNewContact(new Contact("Cem", "123963"));
        phone.printContact();

        System.out.println("Index: " + phone.findContact(ahmet));
        System.out.println("Index with String: " + phone.findContact(ahmet.getName()));
        System.out.println("Query Contact: " + phone.queryContact("Ayşe"));
        phone.removeContact(ahmet);
        phone.printContact();
    }
}