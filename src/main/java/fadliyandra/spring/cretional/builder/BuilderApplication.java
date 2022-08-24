package fadliyandra.spring.cretional.builder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BuilderApplication {

    @Bean
    @Scope("prototype")
    public Product productGadget(){
        return Product.builder()
                .category(Category.GADGET)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Product productFashion(){
        return Product.builder()
                .category(Category.FASHION)
                .build();
    }


}
