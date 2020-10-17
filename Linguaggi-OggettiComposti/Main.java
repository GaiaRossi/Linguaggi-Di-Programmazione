public class Main{
    public static void main(String args[]){
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        System.out.println(counter.getValue());
        counter.decrement();
        System.out.println(counter.getValue());


        CounterComposto cd = new CounterComposto();
        cd.CounterCompostoInc();
        cd.CounterCompostoInc();
        System.out.println(cd.CounterCompostoGetValue());
        cd.CounterCompostoDec();
        System.out.println(cd.CounterCompostoGetValue());
    }
}