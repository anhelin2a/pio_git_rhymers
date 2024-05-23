package edu.kis.vh.nursery;

    
    private static final int TOTAL_NUMBER = 12;
    private static final int EMPTY = -1;
    private static final int MAX_CAPACITY = TOTAL_NUMBER;
    
public class DefaultCountingOutRhymer {

    private final int[] Numbers = new int[TOTAL_NUMBER];
    
    private int total = EMPT;

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
