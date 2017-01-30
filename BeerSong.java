package BeerSong;

/**
 *
 * @author Connor
 */
public class BeerSong {
    
    static int count = 10;
    
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }
    
    public static void Ninety_Nine_Bottles_of_Beer() {
        for (int i = count; i > 1 ; i-- ) {
            System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
            count -= 1; //SNEAKY
            System.out.println("take one down, pass it around, " + count + " bottles of beer on the wall."); 
        }
    }
    
}