import java.awt.image.BufferedImage;
import java.io.PrintWriter;
import java.lang.String;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Ascii {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File image = new File("file path");
		Scanner s = new Scanner(System.in);
		
		String values = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$";
				
		try 
		{
			BufferedImage bi=ImageIO.read(image);
			Tuple Pixel_Matrix[][] =  new Tuple[bi.getWidth()][bi.getHeight()];
			double luminosity[][] = new double[bi.getWidth()][bi.getHeight()];
			System.out.println(bi.getHeight() + "x" + bi.getWidth());
			PrintWriter pic = new PrintWriter("image.txt");
			
			for (int y = 0; y < bi.getHeight(); y++) 
			{
			    for (int x = 0; x < bi.getWidth(); x++) 
			    	{
			    	Pixel_Matrix[x][y] = new Tuple();
			    	Pixel_Matrix[x][y].SetTuple(bi.getRaster().getPixel(x, y, new int[4])); 
			    	luminosity[x][y] = Pixel_Matrix[x][y].luminosity();
			    	}
			}
			
			for(int i = 0; i < bi.getHeight(); i++)
			{
				pic.println();
				for(int j = 0; j<bi.getWidth(); j++)
				{
					int k = (int)Math.floor(luminosity[j][i]/3.6);
					if(k < values.length())
					{
						pic.print(values.charAt(k));
						pic.print(values.charAt(k));
					}
					else
					{	
						pic.print(values.charAt(values.length()-1));
						pic.print(values.charAt(values.length()-1));			
					}
				}
			}
			pic.close();
			
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
