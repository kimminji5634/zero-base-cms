package zero.base.cms.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zero.base.cms.user.domain.SignUpForm;
import zero.base.cms.user.domain.model.Customer;
import zero.base.cms.user.domain.repository.CustomerRepository;

@Service
@RequiredArgsConstructor
public class SignUpCustomerService {

    private final CustomerRepository customerRepository;

    public Customer signUp(SignUpForm form) {
        return customerRepository.save(Customer.from(form));
    }
}
