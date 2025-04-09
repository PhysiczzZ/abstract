package Logger;

public class Main {
    public static void main(String[] args) {
        SimpleLogger simpleLogger = new SimpleLogger();
        simpleLogger.log("Получилось?");
        simpleLogger.log("Да!");
        simpleLogger.log("Ура!");

        SmartLogger smartLogger = new SmartLogger();
        smartLogger.log("Получилось?");
        smartLogger.log("Да!");
        smartLogger.log("Нет! ОшиБка!");

    }
}
