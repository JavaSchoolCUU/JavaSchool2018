public class Application{

  public static void main(String[] args){
    TopLevelExampleClass topLevel = new TopLevelExampleClass();
    topLevel.method1();
    topLevel.method2();

    NestedExampleClass nestedClass = new NestedExampleClass();
    nestedClass.method1();
    nestedClass.method2();

    // Abstract Classes cannot be instantiated
    // AbstractExampleClass abstractClass = new AbstractExampleClass();
    // abstractClass.method1();

    AnonymousExampleClass anonymousClass = new AnonymousExampleClass();
    anonymousClass.method1();

    FinalExampleClass finalExampleClass = new FinalExampleClass();
    finalExampleClass.myFinalMethod();
  }
}