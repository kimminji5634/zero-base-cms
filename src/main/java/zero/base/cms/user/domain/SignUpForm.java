package zero.base.cms.user.domain;

import lombok.*;

import java.time.LocalDate;

@Getter
/* @Setter test할 때 when, then 계속 안써줘도 되도록*/
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpForm {
    private String email;
    private String name;
    private String password;
    private LocalDate birth;
    private String phone;
}
