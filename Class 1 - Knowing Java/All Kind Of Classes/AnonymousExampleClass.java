public class AnonymousExampleClass{

  public static void main(String args[]){
    AnonymousExampleClass myClass = new AnonymousExampleClass();
    myClass.method1();
  }

  public void method1(){

    int x=0;
    new AbstractExampleClass(){
      public void method1(){
        System.out.println("I'm method1 and I'm inside of an anonymous class " + x);
      }
    }.method1();
  }
}