public class datos2 extends datos {
    private String horario,local;

    public datos2(String horario, String local, String nombre, String apellido, String carrera, int edad) {
        super(nombre, apellido, carrera, edad);
        this.horario = horario;
        this.local = local;
    }

    public String getTaxonomia() {
        return horario;
    }

    public String getAgua() {
        return local;
    }
    
        @Override
      public String mostrardatos(){
          System.out.println("Estudiante 2");
          return "Nombre: "+nombre+"\nApellido: "+apellido+"\nCarrera: "+carrera+"\nEdad: "+edad+"\nHorario: "+horario+"\nLocalidad: "+local;
      }
}
