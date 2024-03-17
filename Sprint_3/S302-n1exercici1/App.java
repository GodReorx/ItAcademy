import com.suits.Broker;
import com.suits.StockAgency;

public class App {
    public static void main(String[] args){
        startApp();
    }

    private static void startApp(){
        Broker harveySpecter = new Broker();
        StockAgency sa1 = new StockAgency("Alliance Advisors");
        StockAgency sa2 = new StockAgency("Visionary Ventures");
        StockAgency sa3 = new StockAgency("Stellar Strategies");

        harveySpecter.addAgency(sa1);
        harveySpecter.addAgency(sa2);
        harveySpecter.addAgency(sa3);
        sa1.asignBroker(harveySpecter);
        sa2.asignBroker(harveySpecter);
        sa3.asignBroker(harveySpecter);

        harveySpecter.changeStock("Potatos","Stocks UP!! SELL!!!");
        harveySpecter.changeStock("Onions","Stocks DOWN!! BUY!!!");

        harveySpecter.delAgency(sa2);

        harveySpecter.changeStock("Toys", "Stock DOWN!! BuY!!");
    }
}
