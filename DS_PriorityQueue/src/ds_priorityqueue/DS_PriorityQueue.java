/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_priorityqueue;

import java.util.PriorityQueue;

/**
 *
 * @author ABHISHEK
 */
public class DS_PriorityQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

//        System.out.println(pq.peek());
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());
        System.out.println(pq.remove(54));

        Object[] ints = pq.toArray();
        for (Object num: ints) {
            System.out.println(num);
        }

        //System.out.println(pq.peek());
        pq.add(-1);
        //System.out.println(pq.peek());
    
    }
    
}
