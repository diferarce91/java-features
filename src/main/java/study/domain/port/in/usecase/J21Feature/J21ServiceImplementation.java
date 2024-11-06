package study.domain.port.in.usecase.J21Feature;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import study.domain.port.in.usecase.J14Feature.UserRecord;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Slf4j
@Service
public class J21ServiceImplementation {

    public void listMethods() {

        List list = Arrays.asList("Diego", "Juan");
        var lastValue =  list.getLast();

        LinkedList linkedList = new LinkedList<>(list);
        var firstItem = linkedList.getFirst();

    }

    public void switchRecordDestructor(UserRecord user) {

        switch (user) {
            case UserRecord (var name, var lastName, var phone) -> log.info(name," ",lastName," ",phone);
            default -> log.info("not found");
        }
    }

    public void emojis(){
        var codePoint = Character.codePointAt("😃", 0);
        var isEmoji = Character.isEmoji(codePoint);
        System.out.println("😃 is an emoji: " + isEmoji);  //true

    }


    public void _Exception(){
        String s = "....";
        try {
            var i = Integer.parseInt(s);
        } catch (NumberFormatException _) {
            System.out.println("No es un número: " + s);
        }
    }
}
