package pkg;

import org.tinylog.Logger;

public class main {
    public static void main(String[] args) {
        Logger.error("this is an error message");
        Logger.warn("this is a warn message");
        Logger.info("this is a info message");
        Logger.debug("this is a debug message");
        Logger.trace("this is a trace message");
        Logger.info("users name is {}",System.getProperty("user.name"));
        Logger.error(new RuntimeException("Oops"), "smth is wrong");
    }
}
