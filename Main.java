import java.util.Scanner;
/**
 * Asks user for number between 1 and 10 and prints out that number of stars in an empty box
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user to input a number between 1 and 10
    System.out.println("Please enter a number between 1 and 10");
    // create a variable for user input
    int integer = input.nextInt();
    
    // declare varibale so can be used outside for loops
    int count;

    // prints out first star in row
    for(count = 1; count <= integer; count++){
      System.out.print("*");
      //prints out following stars
      for( int i = 1; i < integer; i++){
        // only allows first and last row to be full
        if(count >= 2 && count < integer){
          // creates the spaces
          for(int j = 2; j < integer; j++){
           System.out.print(" "); 
          }
          // makes the loop not repeat 
          i = integer;
        }
        //prints out the last star
        System.out.print("*");
      } 
      // puts the stars on different lines
      System.out.println(" ");
      }
    

    
    
    
  }
}
