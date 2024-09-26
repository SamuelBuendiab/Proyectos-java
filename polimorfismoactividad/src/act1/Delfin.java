
package act1;

public class Delfin extends animal {
    private String taxonomia,agua;

    public Delfin(String taxonomia, String agua, String raza, String color, String habitad, int tamano) {
        super(raza, color, habitad, tamano);
        this.taxonomia = taxonomia;
        this.agua = agua;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public String getAgua() {
        return agua;
    }
    
        @Override
      public String mostrardatos(){
          System.out.println("Delfin");
        return "Raza: "+raza+"\nColor: "+color+"\nHabitad: "+habitad+"\nTamaño: "+tamano+"M"+"\nTaxonomia"+taxonomia+"\nTipo de Agua: "+agua;
      }
    
}
