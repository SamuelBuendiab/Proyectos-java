public class datos {
    protected String nombre, apellido,carrera;
    protected int edad;

    public datos(String nombre, String apellido, String carrera, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCarrera() {
        return carrera;
    }
    public int getEdad() {
        return edad;
    }
          
    public String mostrardatos(){
        System.out.println("Estudiante 1");
        return "Nombre: "+nombre+"\nApellido: "+apellido+"\nCarrera: "+carrera+"\nEdad: "+edad;
        
    }
}
