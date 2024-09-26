
package act3;

public class simulacion extends juego {
    private String consola,tipo;

    public simulacion(String consola, String tipo, String desarollador, String nombre, int ano) {
        super(desarollador, nombre, ano);
        this.consola = consola;
        this.tipo = tipo;
    }

    public String getConsola() {
        return consola;
    }

    public String getTipo() {
        return tipo;
    }
   @Override
    public String data(){
       System.out.println("Simulacion");
        return "Desarrollador: "+desarollador+"\nNombre: "+nombre+"\nAño: "+ano+"\nConsola: "+consola+"\nTipo: "+tipo;
    }
}
