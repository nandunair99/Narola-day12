import java.util.logging.Logger;
import java.util.logging.Level;
public class SimpleData {
    private Logger logger = Logger.getGlobal();
    private String data;
    public String getData() {
        logger.log(Level.INFO, "Get data called for SimpleData");
        return data;
    }
    public SimpleData setData(String data) {
        logger.log(Level.INFO, "Set data called for SimpleData");
        this.data = data;
        return this;
    }
}