package fadliyandra.spring.cretional.factory.abstracts;

public interface ChargePayementRequest {

    String getId();

    void setId(String id);

    Long getAmount();

    void setAmount(Long amount);

    Long getFee();

    PaymentMethod getMethod();
}
