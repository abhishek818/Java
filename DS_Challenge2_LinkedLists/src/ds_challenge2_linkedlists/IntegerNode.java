/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_challenge2_linkedlists;

/**
 *
 * @author ABHISHEK
 */
public class IntegerNode {

    private Integer value;
    private IntegerNode next;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public String toString() {
        return value.toString();
    }

}


