
package act1;

public class gato extends animal {
    private String taxonomia,comida;

    public gato(String taxonomia, String comida, String raza, String color, String habitad, int tamano) {
        super(raza, color, habitad, tamano);
        this.taxonomia = taxonomia;
        this.comida = comida;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public String getComida() {
        return comida;
    }
    @Override
      public String mostrardatos(){
          System.out.println("Gato");
        return "Raza: "+raza+"\nColor: "+color+"\nHabitad: "+habitad+"\nTamaño: "+tamano+"cm"+"\nTaxonomia"+taxonomia+"\nComida"+comida;
}
}