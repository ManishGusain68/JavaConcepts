package loops;

public class NestedForLoop {
public static void main(String args[])
{
	int[][]arr = {{1,2,2},{3,6,1},{17,4,2}};
	
	for(int i=0;i<3;i++)
	{
		for (int j=0;j<3;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}
}
