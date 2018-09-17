/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaining_in_hashtables;

/**
 *
 * @author ABHISHEK
 */
public class StoredEmployee {
    public String key;
    public Employee employee;
    
    public StoredEmployee(String key, Employee employee)
    {
        this.key = key;
        this.employee = employee;
    }
}
