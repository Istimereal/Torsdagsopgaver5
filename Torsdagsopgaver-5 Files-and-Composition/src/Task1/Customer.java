package Task1;

public class Customer {
 private   String firstName;
 private  String lastName;
 private   String username;
 private   String name;
 private   int id;
 private static int counter;



    //constructor Customer
    Customer(String firstName, String lastName, String username) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;

        counter ++;
        this.id = counter;

    }

   public  String toString(){
        return "Username: " + username + "\nName: " + firstName + " " +
                lastName +"\nId:" + id;}

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }

    public int getId(){
        return id;
    }

}