import org.apache.logging.log4j.*;

public class Logging {
    private static final Logger LOG = LogManager.getLogger(Logging.class);
    public static void main(String[] args) {
        LOG.debug("this is debug message");
        LOG.info("this is info message");
        LOG.warn("this is warn message");
        LOG.error("this is error message");
        LOG.fatal("this is fatal message");
    }
}
