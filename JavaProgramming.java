import java.util.*;
public class JavaProgramming{

    public static int binarySearch(int arr[],int x,int low ,int high){
        while (low <= high) {
            int mid = low + (high - low) / 2;
    
            
            if (arr[mid] == x)
                return mid;
    
            
            if (arr[mid] < x)
                low = mid + 1;
    
            
            else
                high = mid - 1;
        }
    
        
        
        return -1;


    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.print("ENTER NUMBER OF ELEMENTS: ");
    n = sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
    System.out.println("ENTER ELEMENTS");
    arr[i]=sc.nextInt();
}
Arrays.sort(arr);
System.out.print("ENTER ELEMENT YOU WANT TO SEARCH: ");
int elem=sc.nextInt();
int result = binarySearch(arr,elem,0,arr.length-1);
if(result==-1){
    System.out.println("ERROR");

}
else{
System.out.printf("\n %d is at the index %d",elem,result);
}

    }}
