
package ACT2;

public class cuadrado extends figurageometrica{
    private int lados,tamano;

    public cuadrado(int lados, int tamano, String perimetro, String area, String volumen) {
        super(perimetro, area, volumen);
        this.lados = lados;
        this.tamano = tamano;
    }

    public int getLados() {
        return lados;
    }

    public int getTamano() {
        return tamano;
    }
    
        @Override
        public String datos(){
        System.out.println("Cuadrado");
        return"Perimetro: "+perimetro+"\nArea: "+area+"\nVolumen"+volumen+"\nLados: "+lados+"\nTamano: "+tamano;
    }
    
    
}
