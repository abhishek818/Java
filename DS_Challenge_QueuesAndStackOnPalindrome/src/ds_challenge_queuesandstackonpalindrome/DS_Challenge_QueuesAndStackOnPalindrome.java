/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_challenge_queuesandstackonpalindrome;

/**
 *
 * @author ABHISHEK
 */
import java.util.LinkedList;

public class DS_Challenge_QueuesAndStackOnPalindrome {

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
        LinkedList<Character> queue = new LinkedList<>();
        String lowercase = string.toLowerCase();
        
        for(int i=0; i<lowercase.length(); i++)
        {
            char c = lowercase.charAt(i);
            if(c>='a' && c<='z')
            {
                queue.addLast(c);
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty())
        {
            if(!stack.pop().equals(queue.removeFirst()))
            {
                return false;
            }
        }
        
        return true;
    }
}

