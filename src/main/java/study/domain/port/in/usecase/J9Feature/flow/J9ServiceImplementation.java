package study.domain.port.in.usecase.J9Feature.flow;
import org.springframework.stereotype.Service;

import java.util.concurrent.Flow.*;
import java.util.concurrent.SubmissionPublisher;

@Service
public class J9ServiceImplementation {
    private final SubmissionPublisher publisher;

    public J9ServiceImplementation() {
        this.publisher = new SubmissionPublisher<>();
    }

    public Publisher asPublisher() {
        return publisher;
    }

    public void start(String messagge){
        this.publisher.submit(messagge);
    }
}
