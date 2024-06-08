import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Clase10 {

    private static final  Logger logger = Logger.getLogger(Clase10.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        logger.addHandler(consoleHandler);
        //log
        System.out.println("Log de info");
        logger.info("Esto es un loog de info");
        logger.severe("Esto es un severe");
    }
}
