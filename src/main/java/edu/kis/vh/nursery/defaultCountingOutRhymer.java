package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] Numbers = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
        Numbers[++total] = in;
    }

    public boolean CallCheck() {
        return total == -1;
    }
        
    public boolean IsFull() {
        return total == 11;
    }
        
    protected int Peekaboo() {
        if (CallCheck())
            return -1;
        return Numbers[total];
    }
            
    public int CountOut() {
        if (CallCheck())
            return -1;
        return Numbers[total--];
    }

}
