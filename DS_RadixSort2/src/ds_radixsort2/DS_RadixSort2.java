/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_radixsort2;

/**
 *
 * @author ABHISHEK
 */
public class DS_RadixSort2 {

    
    public static void main(String[] args) {
    
    int[] intArray={ 4725, 4586, 1330, 8792, 1594, 5729 };
    radixSort(intArray, 10, 4);
    
    for(int i=0;i<intArray.length;i++)
        System.out.println(intArray[i]);
    
    }
    
    public static void radixSort(int[] input, int radix ,int width)
    {
        for(int i=0;i<width;i++)
        {
            singleRadixSort(input, i, radix);
        }
    }
 
    public static void singleRadixSort(int[] input,int position, int radix )
    {
        int numItems=input.length;
        int[] countArray=new int[radix];
        
        for(int value: input)
        {
            countArray[getDigit(position, value, radix)]++;
        }
        
        for(int j=1; j < radix; j++)
        {
            countArray[j] +=countArray[j-1];
        }   
        
        int[] temp=new int[numItems];
        for(int tempIndex= numItems-1; tempIndex>=0; tempIndex--)
        {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]]= input[tempIndex];
        }
        
        for(int tempIndex=0; tempIndex<numItems ; tempIndex++)
        {
            input[tempIndex]= temp[tempIndex];
        }
}
        
        public static int getDigit(int position, int value, int radix)
        {
            return value/(int) Math.pow(radix, position) % radix;
        }
}