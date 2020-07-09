package College;


public class linear{    
	 static int  i,j;
public static  int linearSearch(int[][]arr, int key){    
        for(int i=0;i<arr.length;i++){ 
        	if(arr[i][j] == key)
        	for(j=0;j<arr.length;j++)
        	{
            if(arr[i][j] == key){    
                return j;
            }
            return i;  
            }    
        }    
        return -1;    
    }    
    public  static void main(String a[]){    
        int[][] a1= {{10,20,30,50,70,90},
        		{1,3,5,6,7,8}
        };    
        int key = 3;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));  
    }    
    
}