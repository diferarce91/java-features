package study.domain.port.in.usecase.J19Feature;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.domain.port.in.usecase.J14Feature.UserRecord;

@Slf4j
@Service
public class J19ServiceImplementation {

    public void switchInstanceRecord(Object user) {

        log.info("J19 >>>>>>>>>>>>>>>>>>>>>>");
        if(user instanceof UserRecord(String name, String lastName, String phone)){
            log.info("VALUE: "+ name);
        }
    }

    public void switchWhen(UserRecord user) {

        log.info("J19 >>>>>>>>>>>>>>>>>>>>>>");
        switch (user) {
            case UserRecord ur
                    when ur.name().equalsIgnoreCase("Diegos") -> log.info("Diego Name is present");
            case UserRecord ur
                    when ur.lastName().equalsIgnoreCase("Arenas") -> log.info("Arenas Last Name is present");
            case UserRecord ur
                    when ur.phone().equalsIgnoreCase("3053907634") -> log.info("3053907634 Phone is present");
            default -> log.info("not found");
        }
    }
}
