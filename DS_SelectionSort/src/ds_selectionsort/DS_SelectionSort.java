/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_selectionsort;

/**
 *
 * @author ABHISHEK
 */
public class DS_SelectionSort {

    
    public static void main(String[] args) {
        
        int[] intArray={23,55,-48,10,-18,80};
      
        for(int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--)
        {
             int largestNumIndex=0;
         for(int i=1;i<=lastUnsortedIndex;i++)
         {
            
             if(intArray[i]>intArray[largestNumIndex])
             {
                  largestNumIndex=i;
             }
            
         }
             swap(intArray,largestNumIndex,lastUnsortedIndex);
        }
        for(int i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
    }
    
    public static void swap(int[] array,int i ,int j)
    {
        if(i==j)
        {
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
        
    }
}
