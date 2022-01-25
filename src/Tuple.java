import java.util.ArrayList;

public class Tuple {
		
	int[] tuple = new int[3];
	

		



	public void SetTuple(int[] pixel) 
	{
		
		// TODO Auto-generated method stub
		for(int i = 0; i< 3; i++)
		{
			tuple[i] = pixel[i];
		}
	}

	
	public double luminosity()
	{
		double lumin =  ((0.21*tuple[0])+(tuple[1]*0.72)+(tuple[2]*0.07));
		 return lumin;
	}



	


}
