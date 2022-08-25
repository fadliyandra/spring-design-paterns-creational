package fadliyandra.spring.cretional.factory.inheritance;

import fadliyandra.spring.cretional.factory.method.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryInheritanceApplication {

    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaFacebook(){
        return new FacebookV2SocialMedia();

    }
    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTwitter(){
        return new TwitterSocialMedia();

    }
    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaInstagram(){
        return new InstagramSocialMedia();

    }
    @Bean
    @Scope("prototype")
    public SocialMedia socialMediaTiktok(){
        return new TiktokSocialMedia();

    }
}
