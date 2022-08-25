package fadliyandra.spring.cretional.factory.abstracts.bcaklikpay;

import fadliyandra.spring.cretional.factory.abstracts.CancelPaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BcaklikpayCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod(){
        return PaymentMethod.BCA_KLIKPAY;
    }


}
