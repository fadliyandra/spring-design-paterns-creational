package fadliyandra.spring.cretional.factory.abstracts;


import fadliyandra.spring.cretional.factory.abstracts.gopay.GopayCancelPaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.gopay.GopayChargePaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.gopay.GopayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory{


    @Override
    public ChargePayementRequest createChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalancePaymentRequest();
    }
}
