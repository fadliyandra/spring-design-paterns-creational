package fadliyandra.spring.cretional.factory.abstracts;


import fadliyandra.spring.cretional.factory.abstracts.creditcard.CeditCardChargePaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.creditcard.CreditCardCancelPaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory{

    @Override
    public ChargePayementRequest createChargeRequest() {
        return new CeditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
       // throw new UnsupportedOperationException("get Balance is not not supported in Credit Card");

        return new CreditCardGetBalancePaymentRequest();
    }
}
