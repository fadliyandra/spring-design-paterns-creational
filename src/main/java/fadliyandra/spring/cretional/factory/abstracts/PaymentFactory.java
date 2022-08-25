package fadliyandra.spring.cretional.factory.abstracts;

public interface PaymentFactory {

    ChargePayementRequest createChargeRequest();

    CancelPaymentRequest createCancelRequest();

    GetBalancePaymentRequest createGetBalanceRequest();

}
