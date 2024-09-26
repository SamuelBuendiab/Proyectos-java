

package ACT2;

public class triangulo extends figurageometrica {
    private String tipos;
    private int lados;

    public triangulo(String tipos, int lados, String perimetro, String area, String volumen) {
        super(perimetro, area, volumen);
        this.tipos = tipos;
        this.lados = lados;
    }

    public String getTipos() {
        return tipos;
    }

    public int getLados() {
        return lados;
    }
            @Override
        public String datos(){
        System.out.println("Triangulo");
        return"Perimetro: "+perimetro+"\nArea: "+area+"\nVolumen"+volumen+"\nLados: "+lados+"\nTipos: "+tipos;
    }
    
    
    
}
