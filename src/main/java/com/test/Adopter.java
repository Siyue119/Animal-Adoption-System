package com.test;

public class Adopter {
    private int id;
    private String Name;
    private String TelNumber;
    private String AdoptionDate;
    private int Age;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTelNumber() {
        return TelNumber;
    }

    public void setTelNumber(String telNumber) {
        TelNumber = telNumber;
    }

    public String getAdoptionDate() {
        return AdoptionDate;
    }

    public void setAdoptionDate(String adoptionDate) {
        AdoptionDate = adoptionDate;
    }

    public Adopter() {
    }

    public Adopter(String name,String telNumber, String adoptionDate,int age) {
        Name = name;
        TelNumber = telNumber;
        AdoptionDate = adoptionDate;
        Age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Adopter{" +
                "id=" + id +
                ", Name=" + Name +
                ", TelNumber=" + TelNumber +
                ", AdoptionDate=" + AdoptionDate +
                '}';
    }
}
