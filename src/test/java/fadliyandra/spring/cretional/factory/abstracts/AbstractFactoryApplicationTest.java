package fadliyandra.spring.cretional.factory.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(classes = AbstractFactoryApplication.class)

class AbstractFactoryApplicationTest {

    @Test
    void testAbstyractFactory() {
        PaymentFactory paymentFactoryCreditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
        PaymentFactory paymentFactoryBcaklikpay = applicationContext.getBean(BcaKlikpayPaymentFactory.class);
        PaymentFactory paymentFactoryGopay = applicationContext.getBean(GopayPaymentFactory.class);

        charge(paymentFactoryCreditCard);
        charge(paymentFactoryGopay);
        charge(paymentFactoryBcaklikpay);


    }

    @Autowired
    private ApplicationContext applicationContext;

    public void charge(PaymentFactory paymentFactory){
        ChargePayementRequest request = paymentFactory.createChargeRequest();
        request.setId("xxx");
        request.setAmount(1000000L);

//untuk kirim ke payment gate way
        System.out.println(request);
    }

    public void cancel(PaymentFactory paymentFactory){
        CancelPaymentRequest request = paymentFactory.createCancelRequest();
        request.setId("xxx");
        //kiri, ke payment gate way

        System.out.println(request);
    }
    public Long getBalance(PaymentFactory paymentFactory){
        try{
            GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
            request.setUserId("eko");
            // send to payment gateay
            System.out.println(request);
            return 1000L;
        }catch (UnsupportedOperationException exception){
            return 0L;
        }
    }


}