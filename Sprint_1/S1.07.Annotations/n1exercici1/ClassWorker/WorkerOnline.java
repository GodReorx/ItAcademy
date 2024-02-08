package ClassWorker;

public class WorkerOnline extends Worker {

    private static final int INTERNET = 60;

    public WorkerOnline(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public int calculateSalary(int hours){
        return (hours * super.priceHour) + INTERNET;
    }

}
