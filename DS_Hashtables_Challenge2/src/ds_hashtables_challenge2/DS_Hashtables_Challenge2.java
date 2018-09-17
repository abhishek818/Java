/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_hashtables_challenge2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author ABHISHEK
 */
public class DS_Hashtables_Challenge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));
        
        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();
        
        while(iterator.hasNext())
        {
            Employee employee = iterator.next();
            if(employeeTable.containsKey(employee.getId()))
            {
                remove.add(employee);
            }
            else
            {
                employeeTable.put(employee.getId(), employee);
            }
        }
        
        for(Employee employee: remove)
        {
            employees.remove(employee);
        }
        
        System.out.println("**---------------------------**");
        employees.forEach(e -> System.out.println(e));
    }
    
}
