package fadliyandra.spring.cretional.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testBuilder(){
        Product iphone = Product.builder()
                .id("xxx")
                .name("samsung")
                .sku("xxx")
                .price(20_000_000L)
                .build();
        System.out.println(iphone);
    }

}