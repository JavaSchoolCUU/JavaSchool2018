public class NestedExampleClass implements AbstractExampleClass{

  public void method1(){
    System.out.println("Nested example class - Method 1");
    new NestedClass().nestedMethod2();
  }


  public void method2(){
    System.out.println("Nested example class - Method 2");
    new NestedClass().nestedMethod2();
  }

  class NestedClass{
    public void nestedMethod1(){
      System.out.println("Nested class - Method 1");
    }
  
  
    public void nestedMethod2(){
      System.out.println("Nested class - Method 2");
    }
  }
}