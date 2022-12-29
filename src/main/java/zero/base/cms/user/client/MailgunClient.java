package zero.base.cms.user.client;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import zero.base.cms.user.client.mailgun.SendMailForm;

@FeignClient(name = "mailgun", url = "https://api.mailgun.net/v3/")
@Qualifier("mailgun")
public interface MailgunClient {

    @PostMapping("sandbox40c4d1f5c1354445aca0269c16a2de7f.mailgun.org/messages")
    /*queryString으로 보내야하므로 SpringQueryMap을 사용*/
    ResponseEntity<String> sendEmail(@SpringQueryMap SendMailForm form);
}
