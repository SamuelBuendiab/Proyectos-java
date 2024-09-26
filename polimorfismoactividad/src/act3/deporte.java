
package act3;

public class deporte extends juego{
    private String tipo,equipo;

    public deporte(String tipo, String equipo, String desarollador, String nombre, int ano) {
        super(desarollador, nombre, ano);
        this.tipo = tipo;
        this.equipo = equipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEquipo() {
        return equipo;
    }
    
        @Override
    public String data(){
       System.out.println("Deporte");
        return "Desarrollador: "+desarollador+"\nNombre: "+nombre+"\nAño: "+ano+"\nTipo: "+tipo+"\nEquipo: "+equipo;
    }
    
}
