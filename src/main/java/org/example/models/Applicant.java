package org.example.models;

import org.example.enums.Level;

public class Applicant {
    private String name;
    private String qualification;
    private Integer age;
    private String phoneNumber;
    private Address address;
    private String emailAddress;
    private Level cashierLevel;

    @Override
    public String toString() {
        return "Applicant{" +
                "name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", emailAddress='" + emailAddress + '\'' +
                ", cashierLevel=" + cashierLevel +
                '}';
    }

    public String getName() {
        return name;
    }


    public Level getCashierLevel() {
        return cashierLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCashierLevel(Level cashierLevel) {
        this.cashierLevel = cashierLevel;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName(String emmanuela) {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
