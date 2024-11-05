package study;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.domain.port.in.usecase.J11Feature.J11ServiceImplementation;
import study.domain.port.in.usecase.J12Feature.J12ServiceImplementation;
import study.domain.port.in.usecase.J13Feature.J13ServiceImplementation;
import study.domain.port.in.usecase.J14Feature.J14ServiceImplementation;
import study.domain.port.in.usecase.J14Feature.UserRecord;
import study.domain.port.in.usecase.J19Feature.J19ServiceImplementation;
import study.domain.port.in.usecase.J21Feature.J21ServiceImplementation;
import study.domain.port.in.usecase.J9Feature.flow.J9ServiceImplementation;
import study.domain.port.in.usecase.J9Feature.flow.FlowControllerImplementation;
import study.domain.port.in.usecase.J9Feature.flow.SubscribeAdvice;

import java.io.IOException;

@SpringBootTest
class JavaFeaturesApplicationTests {

	@Autowired
	private J9ServiceImplementation j9i;

	@Autowired
	private J11ServiceImplementation j11i;
	@Autowired
	private J12ServiceImplementation j12i;
	@Autowired
	private J13ServiceImplementation j13i;
	@Autowired
	private J14ServiceImplementation j14i;

	@Autowired
	private J19ServiceImplementation j19i;

	@Autowired
	private J21ServiceImplementation j21i;

	@Test
	void contextLoads() {

		j9i.asPublisher().subscribe(new SubscribeAdvice(new FlowControllerImplementation()));
		j9i.start("Diego");

	}

	@Test
	void j11Test() throws IOException {
		j11i.stringApi();
		j11i.fileFeature();
	}

	@Test
	void j12Test() {
		j12i.switchLambda();
	}

	@Test
	void j13Test() {
		j13i.switchLambda();
	}

	@Test
	void j14Test() {
		j14i.recordFeature();
		j14i.instanceOfFeature();
	}

	@Test
	void j19Test() {

		UserRecord us = new UserRecord("Diego","Arenas","3053907634");
		j19i.switchInstanceRecord(us);
		j19i.switchWhen(us);
	}

	@Test
	void j21Test() {

		j21i.listMethods();
		j21i.switchRecordDestructor(new UserRecord("Diego", "Arenas", "3053907634"));
		j21i.emojis();
	}

}
