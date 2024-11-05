package study.domain.port.in.usecase.J12Feature;

import org.springframework.stereotype.Service;

import java.util.Calendar;

import static java.util.Calendar.*;

@Service
public class J12ServiceImplementation {

    public void switchLambda() {

        switch (Calendar.DAY_OF_WEEK) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY                -> System.out.println(7);
            case THURSDAY, SATURDAY     -> System.out.println(8);
            case WEDNESDAY              -> System.out.println(9);
        }
    }
}
