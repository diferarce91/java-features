package study.domain.port.in.usecase.J14Feature;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class J14ServiceImplementation {

    public void recordFeature() {
        log.info("J14 >>>>>>>>>>>>>>>>>>>>>>");
        UserRecord us = new UserRecord("Diego","Arenas","3053907634");
        log.info("VALUE: "+ us);
    }

    public void instanceOfFeature() {

        Object value = new UserRecord("Diego","Arenas","3053907634");
        if(value instanceof UserRecord user){
            log.info("VALUE: "+ user.name());
        }

    }
}
