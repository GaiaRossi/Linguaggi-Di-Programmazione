public class Counter{
    private int c;
    public Counter(){
        c = 0;
    }
    public void increment(){
        c++;
    }
    public void reset(){
        c = 0;
    }
    public void decrement(){
        c--;
    }
    public int getValue(){
        return c;
    }
}