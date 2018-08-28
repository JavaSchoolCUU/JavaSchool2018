public class Application{

  public static void main(String[] args){
    // int[] arreglo = new int[10];

    // for (int i=0;i<10; i++){
    //   arreglo[i] = 0;
    // }

    // imprimirArreglo(arreglo);

    StringBuilder nombre = new StringBuilder("Victor");
    String apellido = "Anchondo";
    System.out.println(nombre.toString());

    agregarApellido(nombre, apellido);

    System.out.println(nombre.toString());  //VictorAnchondo

  }

  public static void agregarApellido(StringBuilder nombre, String apellido){
    nombre.append(apellido);
    System.out.println(nombre.toString());  //VictorAnchondo
  }

  public static void modificarAlumno(Alumno alumno){
    alumno = new Alumno();
    alumno.nombre="Pablo";
    alumno.edad= 30;
  }



  public static void imprimirArreglo(int[] arreglo){
    System.out.println("Valores del arreglo: ");
    for (int i =0; i<arreglo.length; i++){
      System.out.println("arreglo["+i+"] = "+arreglo[i]);
    }
  }
}