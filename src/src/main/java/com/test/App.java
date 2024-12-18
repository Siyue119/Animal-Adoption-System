package main.java.com.test;


public class App {

    //run the system
    public static void main(String[] args) {
        App app = new App();
        app.start();
        System.out.println("Welcome to the Animal Adoption System!");
    }


    public void start(){
        Menu menu=new Menu();
        Regx regex=new Regx();
        Operate Operate=new Operate();

        while(true){
            menu.mainMenu();
            int item=regex.menuItemValidate(1,6);
            switch(item){
                case 1->Operate.animalManagement();
                case 2->Operate.adopterManagement();
                case 3->Operate.searchLogic();
                case 4->Operate.sort();
                case 5->Operate.modifyLogic();
                case 6->System.exit(0);
            }
        }
    }

}