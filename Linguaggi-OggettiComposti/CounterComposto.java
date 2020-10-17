public class CounterComposto{
    private Counter c;
    public CounterComposto(){
        c = new Counter();
    }
    public void CounterCompostoDec(){
        c.decrement();
    }
    public void CounterCompostoInc(){
        c.increment();
    }
    public void CounterCompostoReset(){
        c.reset();
    }
    public int CounterCompostoGetValue(){
        return c.getValue();
    }
}