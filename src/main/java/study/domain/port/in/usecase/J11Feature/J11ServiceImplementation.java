package study.domain.port.in.usecase.J11Feature;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Slf4j
@Service
public class J11ServiceImplementation {

    public void stringApi() {

        var value = "String";

        log.info(value.isBlank() ? "value is blank" : "No black");

        value = "TEXT|text2";
        log.info(value.lines().collect(Collectors.toList()).toString());

        value = "Diego";
        value.repeat(5);

        value = " HELLO ";
        System.out.println("SAY" + value.strip() + "PLEASE");
        System.out.println("SAY" + value.stripLeading() + "PLEASE");
        System.out.println("SAY" + value.stripTrailing() + "PLEASE");
        System.out.println();
    }

    public void fileFeature() throws IOException {

        log.info("FILE FEATURE >>>>>>>>>>>>>>>>>>>>>>>");
        Path path = Files.writeString(
                Files.createTempFile(
                        "myfile", ".txt"),
                "This was posted on JD");
        String s = Files.readString(path);
        log.info(s);

    }
}
