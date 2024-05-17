import java.util.ArrayList;
import java.util.Date;

public class Estudiante {
    private String codigo;
    private String documento;
    private String nombre;
    private Date fechaNacimiento;
    private String estrato;
    private String email;
    private String info;
    ArrayList <Ayuda> ayudas = new ArrayList();
 
    public Estudiante() {
    }

    public Estudiante(String codigo, String documento, String nombre, Date fechaNacimiento, String estrato, String email,Ayuda ayuda) {
        this.codigo = codigo;
        this.documento = documento;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estrato = estrato;
        this.email = email;
        this.ayudas = new ArrayList<Ayuda>();
        ayudas.add(ayuda);
    }

    public Estudiante(String info) {
        this.info = info;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setAyudas(ArrayList<Ayuda> ayudas) {
        this.ayudas = ayudas;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEstrato() {
        return estrato;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Ayuda> getAyudas() {
        return ayudas;
    }
public void addAyuda(Ayuda ayuda){
       ayudas.add(ayuda);
       
   }
    
   public int getCantidadAyudas (){
       return this.ayudas.size();
   }
    public void imprimirRelacionAyudas(){
       System.out.println("****** RELACION DE " + this.getCantidadAyudas());
       for(Ayuda ayuda: this.ayudas){
           System.out.println(ayuda.imprimirInfoAyudas());     
       }
     
    }
    public void imprimirRelacionNoAyudas(){
       System.out.println("****** RELACION DE " + this.getCantidadAyudas());
       for(Ayuda ayuda: this.ayudas){
           System.out.println(ayuda.imprimirInfoNoAyudas());
           
       }
    }
 public void imprimirInfoAyudas(){
       for(Ayuda ayuda: this.ayudas){
           System.out.println(ayuda.imprimirInfoNoAyudas());
           
       }
    }

    public String mostrarInfoEstudiante()
{
    String informacion = "";
            informacion = "codigo del estudiante: " + codigo + "el nombre del estudiante es: "+nombre;
            informacion = informacion +"el documento del estudiante es: "+ documento;
            informacion = informacion + "su ayuda es: " + this.ayudas.toString();
    return informacion;
}

   
}



    
    
