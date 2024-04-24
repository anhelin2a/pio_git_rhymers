package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

int totalRejected = 0;

    public int ReportRejected() {
        return totalRejected;
    }

    public void CountIn(int in) {
    if (!CallCheck() && in > Peekaboo())
        totalRejected++;
    else
        super.CountIn(in);
    }
}
