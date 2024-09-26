
package act1;

public class animal {
    protected String raza, color,habitad;
    protected int tamano;

    public animal(String raza, String color, String habitad, int tamano) {
        this.raza = raza;
        this.color = color;
        this.habitad = habitad;
        this.tamano = tamano;
    }
    public String getRaza() {
        return raza;
    }
    public String getColor() {
        return color;
    }
    public String getHabitad() {
        return habitad;
    }
    public int getTamano() {
        return tamano;
    }
          
    public String mostrardatos(){
     
        return "Raza: "+raza+"\nColor: "+color+"\nHabitad: "+habitad+"\nTamaño: "+tamano+"m";
        
    }
}
