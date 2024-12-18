package main.java.com.test;

public class Animal {
   private String name;
   private String variety;
   private int age;
   private String gender;
   private String colour;
   private String healthCondition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public Animal() {
    }

    public Animal(String name, String variety, int age, String gender, String colour, String healthCondition) {
        this.name = name;
        this.variety = variety;
        this.age = age;
        this.gender = gender;
        this.colour = colour;
        this.healthCondition = healthCondition;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", variety='" + variety + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", colour='" + colour + '\'' +
                ", healthCondition='" + healthCondition + '\'' +
                '}';
    }
}
