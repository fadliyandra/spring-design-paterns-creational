package fadliyandra.spring.cretional.factory.abstracts.creditcard;

import fadliyandra.spring.cretional.factory.abstracts.GetBalancePaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod(){
        return PaymentMethod.CREDIT_CARD;

    }

}
