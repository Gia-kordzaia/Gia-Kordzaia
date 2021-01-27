package ge.edu.btu;
import org.apache.log4j.Logger;
import org.apache.log4j.chainsaw.Main;

import java.util.logging.Logger;

public class Payment {
    final static Logger logger = Logger.getLogger(Main.class);

    private static void pay(Electricity electricity, Water water){
        System.out.println(electricity.toString());
        System.out.println(water.toString());
        logger.info("კომუნალური გადახდილია: " + electricity.toString());
        logger.info("კომუნალური გადახდილია: " + water.toString());

    }

    public static void main(String[] args) {
        Electricity electricity = new Electricity("1basd123", 10.5);
        Water water = new Water("123", 2.3);
        pay(electricity,water);

    }
}
