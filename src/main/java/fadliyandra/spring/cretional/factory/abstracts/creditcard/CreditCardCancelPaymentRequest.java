package fadliyandra.spring.cretional.factory.abstracts.creditcard;

import fadliyandra.spring.cretional.factory.abstracts.CancelPaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod(){
        return PaymentMethod.CREDIT_CARD;
    }


}
