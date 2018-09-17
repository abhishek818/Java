/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_hashtable;

/**
 *
 * @author ABHISHEK
 */
public class SimpleHashtable {
    
    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }
    
    public void put(String key, Employee employee)
    {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null)
        {
            System.out.println("Sorry, there's already an employee at position "+hashedKey);
        }
        else
        {
            hashtable[hashedKey] = employee;
        }
    }
    
    public Employee get(String key)
    {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }
    
    private int hashKey(String key)
    {
        return key.length() % hashtable.length;
    }
    
    public void printList()
    {
        for(int i=0; i<hashtable.length; i++)
        {
            System.out.println(hashtable[i]);
        }
    }
}
