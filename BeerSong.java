package BeerSong;

/**
 *
 * @author Connor
 */
public class BeerSong {
    
    static int count = 99;
    
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }
    
    public static void Ninety_Nine_Bottles_of_Beer() {
        for (int i = count; i > 2 ; i-- ) {
            System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
            count -= 1; //SNEAKY
            System.out.println("take one down, pass it around, " + count + " bottles of beer on the wall."); 
        }
        
        //ALTERED OUTPUT THAT WILL RUN WHEN 99 THROUGH 3 ARE FINISHED LOOPING
        System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer.");
        count -= 1; //SNEAKY
        System.out.println("take one down, pass it around, " + count + " bottle of beer on the wall.");
        
        //ONLY 1 BOTTLE LEFT, ALTERED ENDING
        System.out.println(count + " bottle of beer on the wall, " + count + " bottle of beer.");
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
    }
    
}