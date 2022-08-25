package fadliyandra.spring.cretional.factory.abstracts.bcaklikpay;

import fadliyandra.spring.cretional.factory.abstracts.GetBalancePaymentRequest;
import fadliyandra.spring.cretional.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BcaklikpayGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod(){
        return PaymentMethod.BCA_KLIKPAY;

    }

}
