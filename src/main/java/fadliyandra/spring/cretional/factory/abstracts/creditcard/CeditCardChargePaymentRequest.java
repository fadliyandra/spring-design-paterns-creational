package fadliyandra.spring.cretional.factory.abstracts.creditcard;

import fadliyandra.spring.cretional.factory.abstracts.ChargePayementRequest;
import fadliyandra.spring.cretional.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CeditCardChargePaymentRequest implements ChargePayementRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee(){
        return getAmount() * 5/100;
    }
    @Override
    public PaymentMethod getMethod(){return PaymentMethod.CREDIT_CARD;}
}
