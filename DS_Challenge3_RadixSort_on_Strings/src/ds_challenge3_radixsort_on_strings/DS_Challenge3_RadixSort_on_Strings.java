/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_challenge3_radixsort_on_strings;

/**
 *
 * @author ABHISHEK
 */
public class DS_Challenge3_RadixSort_on_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde","dcbqd", "omadd","dcbxc", "bbbbb","zzzzz","fhbjf","dcaqc","dcbqc",};
   
        radixSort(stringsArray, 26, 5);
        // do radix sort
//        for(int i = 0; i < stringsArray.length; i++) {
//            System.out.println(stringsArray[i]);
//        }
        for (String stringsArray1 : stringsArray) {
            System.out.println(stringsArray1);
        }
    }
    

    public static void radixSort(String[] input, int radix ,int width)
    {
        for(int i=width-1;i>=0;i--)
        {
            singleRadixSort(input, i, radix);
        }
    }
//
    public static void singleRadixSort(String[] input, int position, int radix )
    {
        int numItems=input.length;
        int[] countArray=new int[radix];
        
        for(String value: input)
        {
            countArray[getDigit(position, value, radix)]++;
        }
        
        for(int j=1; j < radix; j++)
        {
            countArray[j] +=countArray[j-1];
        }   
        
        String[] temp=new String[numItems];
        for(int tempIndex= numItems-1; tempIndex>=0; tempIndex--)
        {
        //    System.out.println(getDigit(position, input[tempIndex], radix));
            temp[--countArray[getDigit(position, input[tempIndex], radix)]]= input[tempIndex];
        }
        
//        for(int tempIndex=0; tempIndex<numItems ; tempIndex++)
//        {
//            input[tempIndex]= temp[tempIndex];
//        }
        System.arraycopy(temp, 0, input, 0, numItems);
}
        
        public static int getDigit(int position, String value, int radix)
        { 
             int count=0;
            char a=value.charAt(position);
            String b=a+"";
            String[] alphabets= {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "l", "k", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            for(int i=0; i<alphabets.length; i++)
            {
                if(b.equals(alphabets[i]))
                {
                   return i;
                }
                
            }
//            System.out.println(count);
              return 0; 
        }
}


//public static void main(String[] args) {
//    
//    int[] intArray={ 4725, 4586, 1330, 8792, 1594, 5729 };
//    radixSort(intArray, 10, 4);
//    
//    for(int i=0;i<intArray.length;i++)
//        System.out.println(intArray[i]);
//    
//    }
//    
//    public static void radixSort(int[] input, int radix ,int width)
//    {
//        for(int i=0;i<width;i++)
//        {
//            singleRadixSort(input, i, radix);
//        }
//    }
// 
//    public static void singleRadixSort(int[] input,int position, int radix )
//    {
//        int numItems=input.length;
//        int[] countArray=new int[radix];
//        
//        for(int value: input)
//        {
//            countArray[getDigit(position, value, radix)]++;
//        }
//        
//        for(int j=1; j < radix; j++)
//        {
//            countArray[j] +=countArray[j-1];
//        }   
//        
//        int[] temp=new int[numItems];
//        for(int tempIndex= numItems-1; tempIndex>=0; tempIndex--)
//        {
//            temp[--countArray[getDigit(position, input[tempIndex], radix)]]= input[tempIndex];
//        }
//        
//        for(int tempIndex=0; tempIndex<numItems ; tempIndex++)
//        {
//            input[tempIndex]= temp[tempIndex];
//        }
//}
//        
//        public static int getDigit(int position, int value, int radix)
//        {
//            return value/(int) Math.pow(radix, position) % radix;
//        }
//}
    
