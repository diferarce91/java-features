package study.domain.port.in.usecase.J9Feature.flow;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Flow.*;

@Slf4j
public class SubscribeAdvice implements Subscriber {

    private Subscription subscription;
    private FlowControllerImplementation flowControllerImpl;

    public SubscribeAdvice( FlowControllerImplementation flowControllerImpl) {
        this.flowControllerImpl = flowControllerImpl;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(Object value) {
        log.info("PROCESSING "+value.toString() );
        String response = this.flowControllerImpl.execute(value.toString());
        log.info("RESPONSE =  "+response);
    }

    @Override
    public void onError(Throwable throwable) {
        log.error("ERROR");
    }

    @Override
    public void onComplete() {
        log.error("DONE");
    }
}
