package org.example.models;

import org.example.enums.Level;

public abstract class Staff {
    private String name;
    private String qualification;
    private Integer age;
    private String phoneNumber;
    private Address houseAddress;
    private String email;
    private Level staffLevel;

    public Staff(String name, String qualification, Integer age, String phoneNumber,
                 Address houseAddress, String email, Level staffLevel) {
        this.name = name;
        this.qualification = qualification;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.houseAddress = houseAddress;
        this.email = email;
        this.staffLevel = staffLevel;
    }

    public Staff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(Address houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Level getStaffLevel() {
        return staffLevel;
    }

    public void setStaffLevel(Level staffLevel) {
        this.staffLevel = staffLevel;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", houseAddress=" + houseAddress +
                ", email='" + email + '\'' +
                ", staffLevel=" + staffLevel +
                '}';
    }
}
