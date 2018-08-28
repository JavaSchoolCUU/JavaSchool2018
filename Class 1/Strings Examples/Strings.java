public class Strings{

  public static void main(String[] args){

    String name = "Victor";
    String lastName = "Anchondo";
    addLastName(name, lastName);
    System.out.println(name);
  }

  public static void addLastName(String name, String lastName){
    name = name +" "+ lastName;
  }
}