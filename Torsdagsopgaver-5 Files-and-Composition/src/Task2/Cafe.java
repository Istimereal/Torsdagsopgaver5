package Task2;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;




public class Cafe {

    String nameFromMenu;

   private ArrayList<String> coffeeMenu = new ArrayList<>();

   public ArrayList getCoffeeMenu(){
       return coffeeMenu;
   }
public void loadMenuData(){
    try{ Scanner scan = new Scanner(file);
        File file = new File("/Torsdagsopgaver-5 Files-and-Composition/coffee.txt");
        nameFromMenu = Scanner(file);

    } catch (FileNotFoundException e) {
        System.out.println("File not found");
    }
    while(Scanner.hasNextLine()){
        coffeeMenu.add(Scanner.nextLine());
    }


   }
