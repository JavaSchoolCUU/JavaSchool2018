public class Application{

  public static void main(String[] args){
    simpleIf("");
    simpleIf("Something here");

    ifElse("");
    ifElse("Something here");

    simpleSwitch(4);
    simpleSwitch(8);
    simpleSwitch(10);
    
    int[] x = new int[10];
    simpleFor(x);
    simpleForEach(x);
    simpleWhile(x);
  }


  public static void simpleIf(String value){
    if (value!=null && !value.isEmpty()){
      System.out.println("Value is not empty - "+value);
    }
  }

  public static void ifElse(String value){
    if (value!=null && !value.isEmpty()){
      System.out.println("Value is not empty - "+value);
    }
    else{
      System.out.println("Value is empty!");
    }
  }

  public static void simpleSwitch(int grade){
    switch (grade){
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("See you the next year");
        break;
      
      case 6:
        System.out.println("You're lucky!");
        break;
      case 7:
        System.out.println("You can do it better!");
        break;
      case 8:
        System.out.println("Good job!");
        break;
      case 9:
        System.out.println("You're are almost a nerd!");
        break;
      case 10:
        System.out.println("You're a nerd");
        break;

      default:
        //haria algo
        break;
      
    }
  }

  public static void simpleFor(int[] x){
     for (int i=0; i<10; i++){
       x[i] = i * 2;
     }
  }

  public static void simpleForEach(int[] x){
    for (int var : x) {
      System.out.println(var);
    }
  }

  public static void simpleWhile(int[] x){
    int i = 0;
    while (i<x.length){
      System.out.println(x[i++]);
    }

    i = 0;
    do{
      System.out.println(x[i++]);
    }while(i<x.length);
  }
}