
package ACT2;
public class figurageometrica {
    protected String perimetro,area,volumen;

    public figurageometrica(String perimetro, String area, String volumen) {
        this.perimetro = perimetro;
        this.area = area;
        this.volumen = volumen;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public String getArea() {
        return area;
    }

    public String getVolumen() {
        return volumen;
    }

  
    
    public String datos(){
        
        return"Perimetro: "+perimetro+"\nArea: "+area+"\nVolumen"+volumen;
    }
    
}
