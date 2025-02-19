package experiment_6;
final class Logger {
  
    void logMessage(String message) {
        System.out.println("Log: " + message);
    }
}

// Attempting to extend final class (will cause an error if uncommented)
/*
class ExtendedLogger extends Logger {
    // This will result in a compilation error because Logger is final
}
*/


public class ques4_logger{
    public static void main(String[] args) {
        Logger logger = new Logger(); 
        logger.logMessage("This is a test log message.");
    }
}
