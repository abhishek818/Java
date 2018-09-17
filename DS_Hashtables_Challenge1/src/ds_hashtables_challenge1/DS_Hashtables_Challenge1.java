/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_hashtables_challenge1;

/**
 *
 * @author ABHISHEK
 */
public class DS_Hashtables_Challenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int[] nums = new int[10];
        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
        for (int i = 0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int hash(int value) {
        
        return Math.abs(value % 10);
    }
    }
    

