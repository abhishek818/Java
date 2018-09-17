/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_stacksonarrays;

/**
 *
 * @author ABHISHEK
 */
public class DS_StacksOnArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        stack.printStack();

        System.out.println(stack.peek());
        //stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

    }
    
}
