/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_stacksonlinkedlists;

/**
 *
 * @author ABHISHEK
 */
public class DS_StacksOnLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        //stack.printStack();

        //System.out.println(stack.peek());
        //stack.printStack();

        System.out.println("Popped: " + stack.pop());
        System.out.println(stack.peek());

    }
}

  
