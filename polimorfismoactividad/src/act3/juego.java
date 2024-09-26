
package act3;

public class juego {
    protected String desarollador,nombre;
    protected int ano;

    public juego(String desarollador, String nombre, int ano) {
        this.desarollador = desarollador;
        this.nombre = nombre;
        this.ano = ano;
    }

    public String getDesarollador() {
        return desarollador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAno() {
        return ano;
    }
    
    public String data(){
        System.out.println("Juego");
        return "Desarrollador: "+desarollador+"\nNombre: "+nombre+"\nAño: "+ano;
    }
    
}
