package zero.base.cms.user.client.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zero.base.cms.user.client.MailgunClient;
import zero.base.cms.user.service.test.EmailSendService;

@SpringBootTest()
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest() {
        // need test code
        mailgunClient.sendEmail(null);
       /* String response = mailgunClient.sendEmail();
        System.out.println(response);*/
    }
}