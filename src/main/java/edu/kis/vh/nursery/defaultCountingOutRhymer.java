package edu.kis.vh.nursery;

    
    public static int TOTAL_NUMBER = 12;
    public static final int EMPT = -1;
    public static int MAX_CAPACIT = TOTAL_NUMBER;

public class DefaultCountingOutRhymer {

    private int[] Numbers = new int[TOTAL_NUMBER];

    public int total = EMPT;

    public void countIn(int in) {
        if (!isFull())
        Numbers[++total] = in;
    }

    public boolean CallCheck() {
        return total == EMPT;
    }
        
    public boolean IsFull() {
        return total == TOTAL_NUMBER;
    }
        
    protected int Peekaboo() {
        if (CallCheck())
            return EMPT;
        return Numbers[total];
    }
            
    public int CountOut() {
        if (CallCheck())
            return EMPT;
        return Numbers[total--];
    }

}
