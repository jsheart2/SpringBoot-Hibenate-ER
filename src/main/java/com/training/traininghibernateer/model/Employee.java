package com.training.traininghibernateer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class Employee {
	
	String name;
    String email;
    String address;
    String phoneNumber;


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

   
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    @Id
    @Column(name="phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "[" + this.getname() + ", " + this.getemail() + ", " + this.getaddress() + ", " + "]";
    }
}
