/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_challenge_stacksonpalindromestrings;

import java.util.LinkedList;

/**
 *
 * @author ABHISHEK
 */
public class DS_Challenge_StacksOnPalindromeStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
    
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();
        
        for(int i = 0; i < string.length() ; i++)
        {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z')
            {
                stringNoPunctuation.append(c);
                stack.push(c);
            }
        }
        
        StringBuilder reversedString = new StringBuilder(stack.size()); 
        while(!stack.isEmpty())
        {
            reversedString.append(stack.pop());
        }
        return reversedString.toString().equals(stringNoPunctuation.toString());
    }
}

    
