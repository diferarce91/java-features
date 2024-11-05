package study.domain.port.in.usecase.J13Feature;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Calendar;

import static java.util.Calendar.*;

@Slf4j
@Service
public class J13ServiceImplementation {

    public void switchLambda() {
        log.info("J13 >>>>>>>>>>>>>>>>>>>>>>");
        String result = switch (DAY_OF_WEEK) {
            case MONDAY, FRIDAY, SUNDAY -> {
                String value = "Text precessed";
                yield value;
            }
            case TUESDAY -> {
                String value = "Text precessed";
                yield value;
            }
            default -> throw new IllegalStateException("Unexpected value: " + DAY_OF_WEEK);
        };

        log.info("VALUE "+result);
    }
}
