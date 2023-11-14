package patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import patterns.singleton.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private Logger logger;
    @Test
    void testLog(){
        //given
        logger = Logger.INSTANCE;
        //when
        logger.log("Something");
        //then
        assertNotNull(logger.getLastLog());
    }
}
