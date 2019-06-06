package studystuff_geeksforgeeks_algorithm;

import java.util.Scanner;

public class LinearSearch 

{
	
public static void main(String[] args)
  {
    System.out.println("Linear search");
    int[] arr = {0,212, 1219, 781, 26, 124, 441, 127, 12,21,4117};
    int key;
    System.out.println("Enter the key you want to search");
    Scanner obj=new Scanner(System.in);
    key=obj.nextInt();    
    searchKey(arr,key);
    
    }

public static void searchKey(int arr[], int key)
{
	 boolean flag=false;
	 int i=0;
for( i=0; i<arr.length; i++)
{
 if(arr[i]==key)// if searching element is same as key element then its return true in flag.
 {   
 flag=true;
 break;
 }

}


if(flag)
{
	 System.out.println(key + " key is at index= "+i);}
else
{
	 System.out.println("Key "+key + "  not found");
}
}
   }

// Linear Search is also known as sequential search,  by sequential- it means it searches the element in sequence