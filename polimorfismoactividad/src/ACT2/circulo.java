
package ACT2;

public class circulo extends figurageometrica {
    private float radio;
    private int tamano;

    public circulo(float radio, int tamano, String perimetro, String area, String volumen) {
        super(perimetro, area, volumen);
        this.radio = radio;
        this.tamano = tamano;
    }
    public float getRadio() {
        return radio;
    }
    public int getTamano() {
        return tamano;
    }
    @Override
        public String datos(){
        System.out.println("Circulo");
        return"Perimetro: "+perimetro+"\nArea: "+area+"\nVolumen"+volumen+"\nRadio: "+radio+"\nTamano: "+tamano;
    }
}
