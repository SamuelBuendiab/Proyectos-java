
package act3;

public class musica extends juego {
    private String cancion,instrumiento ;

    public musica(String cancion, String instrumiento, String desarollador, String nombre, int ano) {
        super(desarollador, nombre, ano);
        this.cancion = cancion;
        this.instrumiento = instrumiento;
    }

    public String getCancion() {
        return cancion;
    }

    public String getInstrumiento() {
        return instrumiento;
    }
        @Override
    public String data(){
       System.out.println("Musica");
        return "Desarrollador: "+desarollador+"\nNombre: "+nombre+"\nAño: "+ano+"\nCancion: "+cancion+"\nInstrumento: "+instrumiento;
    }
    
}
