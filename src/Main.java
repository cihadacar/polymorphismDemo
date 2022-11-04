public class Main {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new ConsoleLogger(), new EmailLogger(), new FileLogger()};
//        for (BaseLogger logger : loggers){
//            logger.log("Log message.");
//        }

        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();
    }
}