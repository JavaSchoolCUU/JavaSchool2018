public class Strings2{

  public static void main(String[] args){

    StringBuilder name = new StringBuilder("Victor");
    String lastName = "Anchondo";
    addLastName(name, lastName);
    System.out.println(name);
  }

  public static void addLastName(StringBuilder name, String lastName){
    name.append(" ");
    name.append(lastName);
  }
}