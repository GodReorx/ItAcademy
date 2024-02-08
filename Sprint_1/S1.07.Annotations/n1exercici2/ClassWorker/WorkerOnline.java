package ClassWorker;

import java.util.EventListener;

public class WorkerOnline extends Worker {

    private static final int INTERNET = 60;

    public WorkerOnline(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    @Deprecated
    public int calculateSalary(int hours, int elecWaterSupply){
        return (hours * super.priceHour) + INTERNET + elecWaterSupply;
    }
    @Override
    public int calculateSalary(int hours){
        return (hours * super.priceHour) + INTERNET;
    }

}
