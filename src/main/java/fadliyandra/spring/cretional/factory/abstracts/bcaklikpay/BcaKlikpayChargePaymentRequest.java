package fadliyandra.spring.cretional.factory.abstracts.bcaklikpay;

import fadliyandra.spring.cretional.factory.abstracts.ChargePayementRequest;
import fadliyandra.spring.cretional.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BcaKlikpayChargePaymentRequest implements ChargePayementRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee(){
        return 5000L;
    }
    @Override
    public PaymentMethod getMethod(){return PaymentMethod.BCA_KLIKPAY;}
}
