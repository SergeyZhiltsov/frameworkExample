package framework.logger;


import io.qameta.allure.Step;
import org.apache.log4j.Logger;

public class MyLogger {

    public Logger log = Logger.getLogger(MyLogger.class);

    public MyLogger() {

    }

    @Step
    public static String open(Object classObjects){
        return "Opening " + classObjects;
    }

    @Step
    public static String cantOpen(Object classObjects){
        return "Can`t open " + classObjects;
    }

    @Step
    public static String waitToLoad(String elementName){
        return "Wait to load " + elementName;
    }

    @Step
    public static String failedToLoad(String elementName){
        return "Failed to load " + elementName;
    }

    @Step
    public static String click(String elementName){
        return "Clicking on " + elementName;
    }

    @Step
    public static String failedToClick(String elementName){
        return "Failed to click on " + elementName + " element is absent or blocked";
    }
}
