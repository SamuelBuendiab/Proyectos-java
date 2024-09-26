
package act3;

public class principal {
    public static void main(String[] args){
        
        juego juegos[] = new juego[6];
        juegos[0] = new juego("Rockstar","Manhunt",2004);
        juegos[1] = new accion("Matar a darth vader",10,"Electronic arts","Star Wars Jedi: Fallen Order",2019);
        juegos[2] = new deporte("Baloncesto","Angeles Lakers","2k","NBA2k",2021);
        juegos[3] = new aventura("Hyrule","50h","Nintendo","Legend of zelda breath of the wild",2017);
        juegos[4] = new simulacion("Xbox","Aviacion","Asobo Studio","Microsoft flight simulator",2020);
        juegos[5] = new musica("Enter sandman","Guitarra","Neversoft","Guitar hero Metalica",2009);
        
        for(juego opl: juegos){
            System.out.println(opl.data());
            System.out.println(" ");
        }
        
    }
}
