import java.io.IOException;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;
import java.lang.Math;
import java.util.Random;
import java.io.PrintWriter;
import java.io.File;
/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 * @author Xander Gardner
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width, height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  public void Grayscale()
  {
      int average;  
      Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        average = (pixelObj.getGreen() + pixelObj.getRed() + pixelObj.getBlue()) / 3;
          pixelObj.setGreen(average);
        pixelObj.setRed(average);
        pixelObj.setBlue(average);
      }
    }
    }

public void showChar(int charsPerLine, int dLevel){
    Pixel[][] pixels = this.getPixels2D();
    int total = pixels[0].length;
    int num = total / charsPerLine;
    int num2 = 3*num;
    int counter = 1;
    int oCounter = 1;
    for (Pixel[] rowArray : pixels)
    {
      if (num > 0 && (oCounter+num2)%num2 == 0){
        counter = 1;
        for (Pixel pixelObj : rowArray)
      {
          if ((counter+num)%num == 0){
              if (pixelObj.getGreen() >= (96+dLevel)){
                  System.out.print("  ");
                } else if (pixelObj.getGreen() >= (88+dLevel)){
                System.out.print("_");
                } else if (pixelObj.getGreen() >= (80+dLevel)){
                System.out.print("*");
                } else if (pixelObj.getGreen() >= (72+dLevel)){
                System.out.print("1");
                } else if (pixelObj.getGreen() >= (64+dLevel)){
                System.out.print("7");
                } else if (pixelObj.getGreen() >= (56+dLevel)){
                System.out.print("3");
                } else if (pixelObj.getGreen() >= (48+dLevel)){
                System.out.print("2");
                } else if (pixelObj.getGreen() >= (40+dLevel)){
                System.out.print("5");
                } else if (pixelObj.getGreen() >= (32+dLevel)){
                System.out.print("4");
                } else if (pixelObj.getGreen() >= (24+dLevel)){
                System.out.print("9");
                } else if (pixelObj.getGreen() >= (16+dLevel)){
                System.out.print("0");
                } else if (pixelObj.getGreen() >= (8+dLevel)){
                System.out.print("9");
                } else {
                System.out.print("8");
            }
          }
          counter++;
      }
      System.out.println();
    }
    oCounter++;
    }
    }
}
