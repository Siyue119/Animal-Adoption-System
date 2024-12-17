package com.test;

import java.util.*;

public class Operate {
    ArrayList<Animal> animalsList = new ArrayList<>();
    ArrayList<Adopter> adoptersList= new ArrayList<>();


    //Animal Adoption System
    public void animalManagement()
    {
        Menu menu = new Menu();
        Regx regx1 = new Regx();
        while (true) {
            menu.animalManagementMenu();
            int item = regx1.menuItemValidate(1, 4);
            switch (item) {
                case 1 -> this.addAnimal(animalsList);
                case 2 -> this.deleteAnimal(animalsList);
                case 3 -> this.showAll(animalsList);
                case 4 -> {
                    return;
                }
            }
        }
    }

    public void showAll(ArrayList<Animal> animalsList) {
        for (Animal animal : animalsList) {
            System.out.println("Name:" + animal.getName() + "Variety:" + animal.getVariety() + "Age:" + animal.getAge() + "Gender:" + animal.getGender() + "Colour:" + animal.getColour() + "HealthCondition:" + animal.getHealthCondition());
        }
    }

    //add animal record
    public void addAnimal(ArrayList<Animal> animalsList) {
        Animal animal = new Animal();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Animal Name:");
        String animalName = sc.next();
        animal.setName(animalName);

        System.out.print("Enter the Animal Variety:");
        String animalVariety = sc.next();
        animal.setVariety(animalVariety);

        System.out.print("Enter the Animal Age:");
        int animalAge = sc.nextInt();
        animal.setAge(animalAge);

        System.out.print("Enter the Animal Gender:");
        String animalGender = sc.next();
        animal.setGender(animalGender);

        System.out.print("Enter the Animal Colour:");
        String animalColour = sc.next();
        animal.setColour(animalColour);

        System.out.print("Enter the Animal HealthCondition:");
        String animalHealthCondition = sc.next();
        animal.setHealthCondition((animalHealthCondition));

        animalsList.add(animal);
        System.out.println("Animal is added successfully!");
    }



    //delete animal record
    public   void deleteAnimal(ArrayList<Animal> animalsList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Animal name:");
        String animalName = sc.next();

        for (int i = 0; i < animalsList.size(); i++) {
            if (animalName.equals(animalsList.get(i).getName())) {
                animalsList.remove(i);
                System.out.println("Remove successfully!");
                break;
            }
        }
    }




   //search animal record
    public  void searchLogic() {

        Menu menu = new Menu();
        Regx regx1 = new Regx();
        while (true) {
            menu.searchMenu();
            int item = regx1.menuItemValidate(1, 3);
            switch (item) {
                case 1 -> this.searchAnimal();
                case 2 -> this.searchAdopter();
                case 3 -> {
                    return;
                }
            }
        }

    }

    public void searchAdopter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Adopter name to search:");
        String adopterName = sc.next();

        for (Adopter adopter : adoptersList) {
            if (adopterName.equals(adopter.getName())) {
                System.out.println("Name:" + adopter.getName() + "Phone Number:" + adopter.getTelNumber() + "Age:" + adopter.getAge() + "Adoption Number:" + adopter.getId());
            }else {
                System.out.println("Adopter not found!");
            }
    }}

    public void searchAnimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Animal name to search:");
        String animalName = sc.next();

        for (Animal animal : animalsList) {
            if (animalName.equals(animal.getName())) {
                System.out.println("Name:" + animal.getName() + "Variety:" + animal.getVariety() + "Age:" + animal.getAge() + "Gender:" + animal.getGender() + "Colour:" + animal.getColour() + "HealthCondition:" + animal.getHealthCondition());
            }else {
                System.out.println("Animal not found!");

            }
        }
    }


    //sort
    public void sort() {
        Menu menu = new Menu();
        Regx regx1 = new Regx();
        while (true) {
            menu.sortMenu();
            int item = regx1.menuItemValidate(1, 3);
            switch (item) {
                case 1 -> this.sortbyAdoptionNumber();
                case 2 -> this.sortbyAnimalAge();
                case 3 -> {
                    return;
                }
            }
        }
    }

    private void sortbyAdoptionNumber() {
        Collections.sort(this.adoptersList,new orderAdopter());
        for(int i=0;i<this.adoptersList.size();i++){
            this.adoptersList.get(i).setId(i+1);
        }
    }

    class orderAdopter implements Comparator<Adopter>{

        @Override
        public int compare(Adopter o1, Adopter o2) {
            return o1.getId() - o2.getId();
        }
    }
    //sort by animal age
        public  void sortbyAnimalAge(){
            Collections.sort(this.animalsList, new orderAnimal());
            for(int i=0;i<this.animalsList.size();i++){
                this.animalsList.get(i).setAge(i+1);
            }
        }

    public void modifyLogic() {
        Menu menu = new Menu();
        Regx regx1 = new Regx();
        while (true) {
            menu.modifyMenu();
            int item = regx1.menuItemValidate(1, 3);
            switch (item) {
                case 1 -> this.modifyAnimal();
                case 2 -> this.modifyAdopter();
                case 3 -> {
                    return;
                }
            }
        }
        
    }

    public void modifyAdopter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Adopter name to modify:");
        String adopterName = sc.next();

        for (Adopter adopter : adoptersList) {
            if (adopterName.equals(adopter.getName())) {
                System.out.println("Name:" + adopter.getName() + "Phone Number:" + adopter.getTelNumber() + "Age:" + adopter.getAge() + "Adoption Number:" + adopter.getId());
                System.out.print("Enter the new Phone Number:");
                String newPhoneNumber = sc.next();
                adopter.setTelNumber(newPhoneNumber);
                System.out.println("Phone Number is modified successfully!");
                break;
            }
    }}

    public void modifyAnimal() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Animal name to modify:");
            String animalName = sc.next();

            for (Animal animal : animalsList) {
                if (animalName.equals(animal.getName())) {
                    System.out.println("Name:" + animal.getName() + "Variety:" + animal.getVariety() + "Age:" + animal.getAge() + "Gender:" + animal.getGender() + "Colour:" + animal.getColour() + "HealthCondition:" + animal.getHealthCondition());
                    System.out.print("Enter the new Age:");
                    int newAge = sc.nextInt();
                    animal.setAge(newAge);
                    System.out.println("Age is modified successfully!");
                    break;
        }
    }}

    class orderAnimal implements Comparator<Animal>{
            /// /comparator sorted by age
            @Override
            public int compare(Animal o1, Animal o2) {
                return  o1.getAge() - o2.getAge();
            }
        }


    public void deleteAdopter(ArrayList<Adopter> adoptersList) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Adopter name:");
        String adopterName = sc.next();

        for (int i = 0; i < adoptersList.size(); i++) {
            if (adopterName.equals(adoptersList.get(i).getName())) {
                adoptersList.remove(i);
                System.out.println("Remove successfully!");
                break;
            }
        }

    }

    public void addAdopter(ArrayList<Adopter> adoptersList) {
        Adopter adopter = new Adopter();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Adopter Name:");
        String adopterName = sc.next();
        adopter.setName(adopterName);

        System.out.print("Enter the Adopter phoneNumber:");
        int adopterPhoneNumber = Integer.parseInt(sc.next());
        adopter.setTelNumber(String.valueOf(adopterPhoneNumber));

        System.out.print("Enter the Adopter Age:");
        int adopterAge =  sc.nextInt();
        adopter.setAge(adopterAge);
        
        adopter.setId(adoptersList.size());

        adoptersList.add(adopter);
        System.out.println("Adopter is added successfully!");
    }

    public void adopterManagement() {
        Menu menu = new Menu();
        Regx regx1 = new Regx();
        while (true) {
            menu.adopterManagementMenu();
            int item = regx1.menuItemValidate(1, 4);
            switch (item) {
                case 1 -> this.addAdopter(adoptersList);
                case 2 -> this.deleteAdopter(adoptersList);
                case 3 -> this.showAllAdopter(adoptersList);
                case 4 -> {
                    return;
                }
            }
        }
    }

    public void showAllAdopter(ArrayList<Adopter> adoptersList) {
        for (Adopter adopter : adoptersList) {
            System.out.println("Name:" + adopter.getName() + "Phone Number:" + adopter.getTelNumber() + "Age:" + adopter.getAge() + "Adoption Number:" + adopter.getId());
        }

    }
}