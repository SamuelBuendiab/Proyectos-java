
package act1;
public class Gusano extends animal{
    private String taxonomia,pais;
 

    public Gusano(String taxonomia, String pais, String raza, String color, String habitad, int tamano) {
        super(raza, color, habitad, tamano);
        this.taxonomia = taxonomia;
        this.pais = pais;
    }

    public String getTaxonomia() {
        return taxonomia;
    }

    public String getPais() {
        return pais;
    }

            @Override
      public String mostrardatos(){
          System.out.println("Gusano");
        return "Raza: "+raza+"\nColor: "+color+"\nHabitad: "+habitad+"\nTamaño: "+tamano+"mm"+"\nTaxonomia"+taxonomia+"\nPaiz de origen: "+pais;
      }
}
