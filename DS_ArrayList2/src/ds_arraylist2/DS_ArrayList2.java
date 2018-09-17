/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_arraylist2;

/**
 *
 * @author ABHISHEK
 */
import java.util.ArrayList;
import java.util.List;
public class DS_ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        
        employeeList.add(new Employee("alan","turing",3573));
                employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        
        employeeList.forEach(employee -> System.out.println(employee));
         System.out.println(employeeList.isEmpty());
         System.out.println(employeeList.size());
         
         Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
 System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
       System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));
//    Employee employee1=new Employee("alan","turing",6675);
//        System.out.println(employee1);
//        String name=employee1.getFirstName();
//        System.out.println(name);
    }
    
}
