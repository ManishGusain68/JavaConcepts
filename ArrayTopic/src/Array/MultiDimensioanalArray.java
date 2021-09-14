package Array;

public class MultiDimensioanalArray {

	public static void main(String args[])
	
	{
		
		int[][][] arr= { {{1,2,10},{3,4,11}},{{5,6,12},{7,8,13}} } ;  
			
		//System.out.println(arr[1][1][1]);
		
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				for(int k=0; k<3;k++)
				{
				System.out.print(arr[i][j][k]+" ");
				}
			}
			System.out.println();
		}
}
}

















