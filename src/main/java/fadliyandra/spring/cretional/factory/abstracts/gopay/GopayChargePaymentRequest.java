package fadliyandra.spring.cretional.factory.abstracts.gopay;

import fadliyandra.spring.cretional.factory.abstracts.ChargePayementRequest;
import fadliyandra.spring.cretional.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class GopayChargePaymentRequest implements ChargePayementRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee(){

        return 1000L;
    }
    @Override
    public PaymentMethod getMethod(){return PaymentMethod.GOPAY;}
}
