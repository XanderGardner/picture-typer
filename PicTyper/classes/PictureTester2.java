/**
 * This is the main class which asks for user input
 * to call the showChar method
 * 
 * @author Xander Gardner 
 */
import java.util.Scanner;
public class PictureTester2
{
  public static void testGrayChar(int font, String picName, int level)
  {
      int numChars = 850 / font;
      Picture picture = new Picture(picName);
      picture.Grayscale();
      picture.showChar(numChars, level);
  }
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Welcome to the Picture Typer Program\n");
    System.out.println("First, make sure your picture is in the PicTyper -> Images folder");
    System.out.println("Your text picture is setup for a word document, times new roman, 0.0 paragraph spacing, 1.15 line spacing\n");
    
    System.out.println("Enter the name of your picture... such as \"albert1.jpg\"");
    String inputPicName = in.next();
    
    System.out.println("\nEnter desired font size: ");
    int inputFont = in.nextInt();
    
    System.out.println("\nEnter the level of darkness. The higher the number, the more dark the picture will appear.");
    System.out.println("25 is recommended");
    int inputLevel = in.nextInt();
    
    System.out.println("\n\n");
    
    testGrayChar(inputFont, inputPicName, inputLevel);
    System.out.print("\nMade with " + inputFont + " point font and a " +inputLevel+ " darkness level");
    }
}












