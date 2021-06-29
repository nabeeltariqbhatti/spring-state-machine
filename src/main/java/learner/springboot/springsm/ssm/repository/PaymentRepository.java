package learner.springboot.springsm.ssm.repository;

import learner.springboot.springsm.ssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {


}
