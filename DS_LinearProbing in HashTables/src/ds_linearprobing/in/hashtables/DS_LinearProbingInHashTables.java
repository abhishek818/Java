/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_linearprobing.in.hashtables;

/**
 *
 * @author ABHISHEK
 */
public class DS_LinearProbingInHashTables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();
        

        System.out.println(ht.getClass().getName());

        System.out.println("@@@@@@@@@@@");
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        ht.printHashtable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashtable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

    }
    }
   
