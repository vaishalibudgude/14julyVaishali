package arrayStudy;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
	//	declaration and initialization
     int rollNum[]= {1,2,3,4,5,6};
     //usage
     for(int i=0;i<=rollNum.length-1;i++)
     {
    	 System.out.println(rollNum[i]);
     }
     System.out.println("=======================");
     int rollNum1[]= {4,5,8,9,2,3,1,6};
     Arrays.sort(rollNum1);
     for(int i=0;i<=rollNum1.length-1;i++)
     {
    	 System.out.println(rollNum1[i]);
     }
     System.out.println("==========================");
     
     for(int i=rollNum1.length-1;i>=0;i--)
     {
    	 System.out.println(rollNum1[i]);
     }
    	 
     
     
     
     
	}

}
