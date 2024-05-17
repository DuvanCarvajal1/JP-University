import java.util.Fecha;

public class JPuniversity {
Estudiante informacion;
Fecha dateNaci;
Fecha dateNaci2;
Fecha dateNaci3;
Fecha dateAsig;
Fecha dateAsig2;
Fecha dateAsig3;
Fecha dateEntre;
Fecha dateEntre2;
Fecha dateEntre3;
Estudiante estudiante1;
Estudiante estudiante2;
Estudiante estudiante3;
    public static void main(String[] args) {
    //nacimiento
      Fecha dateNaci= new Date("12","05","2003");
      Fecha dateNaci2= new Date("14","03","2004");
      Fecha dateNaci3= new Date("21","01","2002");
      //asignacion de las ayudas
      Fecha dateAsig = new Date("19","09","2020");
      Fecha dateAsig2= new Date("14","04","2020");
      Fecha dateAsig3= new Date("01","02","2020");
      //entrega de las ayudas
      Fecha dateEntre= new Date("18","10","2020");
      Fecha dateEntre2= new Date("24","05","2020");
      Fecha dateEntre3= new Date("10","04","2020");
      
      
      //estudiantes
      Estudiante estudiante1= new Estudiante ("148781748","71274829","duvan",dateNaci,"2","duvan@ufps.edu.co");
      Estudiante estudiante2= new Estudiante ("148786346","1111498745","sol",dateNaci2,"3","sol@ufps.edu.co");
      Estudiante estudiante3= new Estudiante ("1487992156","1983508722","mario",dateNaci3,"4","mario@ufps.edu.co");
      
      
    //imprimir
      
    System.out.println(estudiante1.mostrarInfoEstudiante());
    System.out.println("");
    System.out.println(estudiante2.mostrarInfoEstudiante());
    System.out.println("");
    System.out.println(estudiante3.mostrarInfoEstudiante());
        
     //ayudas
     
        System.out.println("");
        estudiante1.imprimirRelacionAyudas();
        System.out.println("");
        estudiante2.imprimirRelacionNoAyudas();
        System.out.println("");
        estudiante3.imprimirRelacionAyudas();
    }
    
}
