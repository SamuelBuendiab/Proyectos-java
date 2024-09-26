
package act3;

public class accion extends juego {
    private String objetivo;
    private int misiones;

    public accion(String objetivo, int misiones, String desarollador, String nombre, int ano) {
        super(desarollador, nombre, ano);
        this.objetivo = objetivo;
        this.misiones = misiones;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public int getMisiones() {
        return misiones;
    }
    
    @Override
    public String data(){
       System.out.println("Accion");
        return "Desarrollador: "+desarollador+"\nNombre: "+nombre+"\nAño: "+ano+"\nObjetivo: "+objetivo+"\nMisiones: "+misiones;
    }
    
}
