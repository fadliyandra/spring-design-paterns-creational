package fadliyandra.spring.cretional.factory.abstracts;

import fadliyandra.spring.cretional.factory.abstracts.bcaklikpay.BcaKlikpayChargePaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.bcaklikpay.BcaklikpayCancelPaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.bcaklikpay.BcaklikpayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BcaKlikpayPaymentFactory implements PaymentFactory{


    @Override
    public ChargePayementRequest createChargeRequest() {
        return new BcaKlikpayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BcaklikpayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BcaklikpayGetBalancePaymentRequest();
    }
}
