package factoryBrowser2;

import factoryBrowser2.Chrome;
import factoryBrowser2.Edge;

public class FactoryBrowser {
    public static IBrowser make(String type){
        IBrowser browser;
        switch (type.toLowerCase()){
            case "chrome":
                browser = new Chrome();
                break;
            case "firefox":
                browser = new Firefox();
                break;
            default:
                browser = new Edge();
                break;
        }
        return browser;
    }
}
