package main.java.com.test;

public class Menu {
    public void mainMenu() {
    System.out.println("*********************************************************");
    System.out.println("** 1\033[31m Adopted animals' information management \033[0m     **");
    System.out.println("** 2\033[32m Adopters' information management  \033[0m           **");
    System.out.println("** 3\033[33m Search for information  \033[0m                     **");
    System.out.println("** 4\033[34m Sort and organize  \033[0m                          **");
    System.out.println("** 5\033[35m Modify the information\033[0m                       **");
    System.out.println("** 6\033[36m Log out\033[0m                                      **");
    System.out.println("*************************");
}
    public void animalManagementMenu()
    {   System.out.println("***********************************************");
        System.out.println("**      1 Add information                    **");
        System.out.println("**      2 Delete information                 **");
        System.out.println("**      3 Show all information               **");
        System.out.println("**      4 Go back to the previous level      **");
        System.out.println("***********************************************");}
    public void adopterManagementMenu()
    {  System.out.println("***********************************************");
        System.out.println("**      1 Add information                    **");
        System.out.println("**      2 Delete information                 **");
        System.out.println("**      3 Show all information               **");
        System.out.println("**      4 Go back to the previous level      **");
        System.out.println("***********************************************");}
    public void searchMenu()
    {  System.out.println("***********************************************");
        System.out.println("**      1 Search animal  information        **");
        System.out.println("**      2 Search adopter information        **");
        System.out.println("**      3 Go back to the previous level     **");
        System.out.println("***********************************************");}
    public void sortMenu()
    {  System.out.println("***********************************************");
        System.out.println("**      1 Sort by adoption number           **");
        System.out.println("**      2 Sort by animal breed              **");
        System.out.println("**      3 Go back to the previous level     **");
        System.out.println("***********************************************");}
    public void modifyMenu()
    {  System.out.println("***********************************************");
        System.out.println("**      1 Modify the animal information     **");
        System.out.println("**      2 Modify the adopter information    **");
        System.out.println("**      3 Go back to the previous level     **");
        System.out.println("***********************************************");}
}
