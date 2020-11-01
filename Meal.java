import java.util.Scanner;

public class Meal{
  static void menu(){
    System.out.println("These are the options for your meal plan:\n");
    System.out.println("Add a meal for your meal plan: a");
    System.out.println("Add shopping list items: s");
    System.out.println("Display your meal plan: d");
    System.out.println("Leave your meal plan: q");
    menuSelect();
  }
  static void menuSelect(){
    int[] menu;
    Scanner myObj = new Scanner(System.in);
    System.out.println("please choose an option");
    String choice = myObj.nextLine();
    //System.out.println(choice);
    if(choice.equals("a")) {
      System.out.println("what would you like to add?");
      Scanner the = new Scanner(System.in);
      int item = the.nextInt();
      menu = addItem(menu, item);
    } else if(choice.equals("s")) {
      System.out.println("s");
    } else if(choice.equals("d")) {
      System.out.println("d");
    } else if(choice.equals("q")) {
      System.out.println("q");
    }else {
      System.out.println("didnt work");
    }
  }
  public static int addItem(int menu[], int item){
    int n = menu.length;
    int newarray[] = new int[n + 1];
    for (i = 0; i < n; i++)
        newarray[i] = menu[i];

    newarray[n] = item;

    return newarray;
  }


  public static void main(String[]args){
    menu();
  }
}