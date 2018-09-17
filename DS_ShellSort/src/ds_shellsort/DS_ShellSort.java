/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_shellsort;

/**
 *
 * @author ABHISHEK
 */
public class DS_ShellSort {

  
    public static void main(String[] args) {
        int[] array={-22,56,12,67,-90,30,10};
    
        for(int gap=array.length/2;gap>0;gap/=2){
           for(int i=gap;i<array.length;i++){
               int newElement=array[i];
               
               int j=i;
              
            while(j>=gap && array[j-gap]>newElement) {
                array[j]=array[j-gap];
                j-=gap;
            } 
            array[j]=newElement;
           } 
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    
}
