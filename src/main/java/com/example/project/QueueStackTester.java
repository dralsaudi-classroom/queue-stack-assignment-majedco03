package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
        if(q.length()<=0)
            return;

        int Counter=0;
        while(Counter<q.length()){
            if(Counter%2==0){
                T tmp = q.serve();
                oq.enqueue(tmp);
                q.enqueue(tmp);
                Counter++;

            }
            else{
                T tmp = q.serve();
                eq.enqueue(tmp);
                q.enqueue(tmp);
                Counter++;
            }


        }
        // Write the recursive static method split that splits a queue of n elements into two
        // queues. The elements with odd orders (i.e. 1st, 3rd, 5th ...) should be put in the
        // first queue and elements with even orders (i.e. 2nd, 4th, 6th ...) should be put in
        // the second queue. The original queue should remain unchanged at the end of the
        // method.
        // Example. Given the queue (A, B, C, D, E), split results in oq (A, C, E), and eq(B, D).
    }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
        if (pq.length()<=0)
            return;

        int count = pq.length();
        LinkedPQ<T> tmpPQ = new LinkedPQ<T>();
        for (int i=0; i<count; i++) {
            PQElement<T> tmp = pq.serve();
            if(tmp.p>=p)
                tmpPQ.enqueue(tmp.data, tmp.p);
        }
        count=tmpPQ.length();
        for (int i = 0; i <count; i++) {
            PQElement<T> tmp = tmpPQ.serve();
            pq.enqueue(tmp.data, tmp.p);
        }
            // Write a static method remove that removes every element in the priority queue
            // having priority less than p.
            // Example. Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2] remove(pq, 5) results in
            // pq: [A, 10], [D, 8], [B, 5].



    }
    public static <T> boolean search(Stack<T> st, T e)
    {
        if (st.empty())
            return false; T top = st.pop(); boolean found;
        if (top.equals(e)) found = true;
        else
            found = search(st, e); st.push(top);
        return found;


        // Write the recursive static method search that searches for an element e in a stack st
        // and returns true if it’s found or false otherwise. st should not change at the end of
        // the method. You are not allowed to use any auxiliary data structures.
        // Example. Given the stack st (top-to-bottom): 5, 7, 5, 3, 2. search(st, 3) returns
        // true while search(st, 1) returns false.
    }
}