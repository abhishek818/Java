/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_doublylinkedlists;

/**
 *
 * @author ABHISHEK
 */
public class DS_DoublyLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

    
        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        System.out.println(list.getSize());
        
        Employee bill = new Employee("Bill" , "Gates", 947);
        
        list.addToEnd(bill);
        
        list.printList();
        System.out.println(list.getSize());
        
        list.removeFromFront();
        
        list.printList();
        System.out.println(list.getSize());
        
        list.removeFromEnd();
        
        list.printList();
        System.out.println(list.getSize());
    }
}
 
    
    

