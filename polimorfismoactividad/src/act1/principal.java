
package act1;
public class principal {
    public static void main(String[] args){
        
        animal animales[] = new animal[4];
        animales[0] = new animal("Pastor aleman","Dorado con negro","Ciudades,pueblos,fincas",1);
        animales[1] = new gato("Felis catus","MaxCat","siames","Blanco,negro y gris","ciudades",30);
        animales[2] = new Delfin("Delphinus Linnaeus","Salada","Delfin","Gris con negro","Mares",5);
        animales[3] = new Gusano("Bombyx mori.","China","Gusano de seda","Blanco","Arboles",3);
        
        for(animal op1: animales){
            System.out.println(op1.mostrardatos());
            System.out.println("");
        }
    }
}
