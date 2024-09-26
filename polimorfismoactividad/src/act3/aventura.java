
package act3;

public class aventura extends juego {
    private String mapa,completar;

    public aventura(String mapa, String completar, String desarollador, String nombre, int ano) {
        super(desarollador, nombre, ano);
        this.mapa = mapa;
        this.completar = completar;
    }

    public String getMapa() {
        return mapa;
    }

    public String getCompletar() {
        return completar;
    }
    
   @Override
    public String data(){
       System.out.println("Aventura");
        return "Desarrollador: "+desarollador+"\nNombre: "+nombre+"\nAño: "+ano+"\nUbicacion: "+mapa+"\nTiempo para completar: "+completar;
    }
}
