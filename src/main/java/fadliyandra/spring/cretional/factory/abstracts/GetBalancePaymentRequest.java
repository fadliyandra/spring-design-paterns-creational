package fadliyandra.spring.cretional.factory.abstracts;

public interface GetBalancePaymentRequest {
    String getUserId();
    void setUserId(String userId);
    PaymentMethod getMethod();
}
