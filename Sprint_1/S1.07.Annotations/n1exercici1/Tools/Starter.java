package Tools;

import ClassWorker.Worker;
import ClassWorker.WorkerOnline;
import ClassWorker.WorkerPresencial;

public abstract class Starter {
    public static void startApp(){
        int hours = 40;
        Worker worker = new Worker("John", "Wick", 20);
        WorkerPresencial workerPresencial = new WorkerPresencial("Elisabeth","Smith",20);
        WorkerOnline workerOnline = new WorkerOnline("Ares","Infernus", 20);

        System.out.println(worker.getName() + " " + worker.getSurname() + " a trabajado " + hours + " y cobrara " + worker.calculateSalary(hours));
        System.out.println(workerPresencial.getName() + " " + workerPresencial.getSurname() + " a trabajado " + hours + " y cobrara " + workerPresencial.calculateSalary(hours));
        System.out.println(workerOnline.getName() + " " + workerOnline.getSurname() + " a trabajado " + hours + " y cobrara " + workerOnline.calculateSalary(hours));
    }
}
