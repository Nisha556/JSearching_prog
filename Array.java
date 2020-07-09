package College;

public class Array {
	int i,j,z;
	public static void main(String args[])
	{
		 int a[][][]= {{
				 {2,9,8,5,7,6,4,3,1} ,
				 {1,3,5,7,8,9,6,5},
				 {1,5,4,3,2,1,7}
		 } };
		 
		 

		  for(int i=0;i<a.length;i++)
		  {
			  
			  for(int j = 0; j<a[i].length;j++)
			  {
				  System.out.println(j );
				  System.out.println();
				
				  for(int z=0; z<a[i][j].length; z++)
				  {
					  System.out.println(z);
		  }
			  }
			
			  System.out.println(i);
			  System.out.println();
			 
		 	}
		  	}
}
