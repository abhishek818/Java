/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_jdklinkedlists;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author ABHISHEK
 */
public class DS_JdkLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
 
        LinkedList<Employee> list= new LinkedList<>();
    
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);
        
        Iterator iterator= list.iterator();
        System.out.println("HEAD -> "); 
        while(iterator.hasNext())
        {
            System.out.print(iterator.next());
            System.out.print("<=>");
        }
        System.out.println("null");
    }
    
}
