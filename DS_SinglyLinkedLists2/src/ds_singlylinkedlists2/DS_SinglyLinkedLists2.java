/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_singlylinkedlists2;

/**
 *
 * @author ABHISHEK
 */
public class DS_SinglyLinkedLists2 {

   
    public static void main(String[] args) {
        
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list= new EmployeeLinkedList();
        System.out.println(list.isEmpty());
         list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());

        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
    
}
