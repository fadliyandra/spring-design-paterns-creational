package fadliyandra.spring.cretional.factory.abstracts;

public interface CancelPaymentRequest {

    String getId();
    void setId(String userId);
    PaymentMethod getMethod();

}
