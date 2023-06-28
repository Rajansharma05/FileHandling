package lineardatastructure;

import java.util.Scanner;
public class LinearSeacrh
{
	public static void main(String[] args) {
        int arr[]={23,45,67,89,12,34,8,1};
       /* Scanner sc=sc.nextInt();
        System.out.println("Enter value");
        int num=sc.nextInt();*/
        int num=18,i;
        for(i=0;i<arr.length;i++){
            if(num==arr[i]){
                System.out.println("Value found"+i);
                break;
            }
            
        }
        if(i==arr.length)
        System.out.println("Value not found");
}
}

