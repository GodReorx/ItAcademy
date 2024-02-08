package ClassWorker;

import java.util.Date;

public class WorkerPresencial extends Worker {
    private static int petrol = 200;

    public WorkerPresencial(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    public static int getPetrol() {
        return petrol;
    }

    public static void setPetrol(int petrol) {
        WorkerPresencial.petrol = petrol;
    }
    @Deprecated
    public int calculateSalary(int hours, int foodExpenses){
        return (hours * super.priceHour) + petrol + foodExpenses;
    }

    @Override
    public int calculateSalary(int hours){
        return (hours * super.priceHour) + petrol;
    }
}
