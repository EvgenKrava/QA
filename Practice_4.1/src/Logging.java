import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    public static void main(String[] args) {
        Logger LOG = LogManager.getLogger(Logging.class);
        LOG.debug("Debug");
        LOG.info("Information");
        LOG.warn("Warning");
        LOG.error("Error");
        LOG.fatal("Fatal");

    }
}
