package learner.springboot.springsm.ssm.config;

import learner.springboot.springsm.ssm.domain.PayementEvent;
import learner.springboot.springsm.ssm.domain.PaymentState;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StateMachineConfigTest {

    @Autowired
    StateMachineFactory<PaymentState, PayementEvent> stateMachineFactory;

    @Test
    void testNewStateMachine(){
        StateMachine<PaymentState,PayementEvent>sm = stateMachineFactory.getStateMachine(UUID.randomUUID());
        sm.start();
        System.out.println(sm.getState().toString());

        sm.sendEvent(PayementEvent.PRE_AUTHORIZE);

        System.out.println(sm.getState().toString());
        sm.sendEvent(PayementEvent.PRE_AUTH_APPROVED);

        System.out.println(sm.getState().toString());




    }

}