package lineardatastructure;
public class BinarySearch
{
	public static void main(String[] args) {
        int arr[]={23,45,67,89,90};
        int num=89,mid=0;
        int start=0;
        int end=arr.length;
        boolean flag=false;
        
        while(start<=end){
        	mid=(start+end)/2;
        	
        	if(arr[mid]==num){
                flag=true;
                break;
            }
        	
            else if(arr[mid]<num)
            start=mid+1;
            else
            end=mid-1;
        }
        
        if(flag==true)
        System.out.println("Value found at :"+ mid);
        else
        System.out.println("Value not found");
    }
}

