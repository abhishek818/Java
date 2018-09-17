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
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    
    private LinkedList<Employee> stack;

    public LinkedStack() {
        stack = new LinkedList<Employee>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }

    public Employee pop() {
        return stack.pop();
    }

    public Employee peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
