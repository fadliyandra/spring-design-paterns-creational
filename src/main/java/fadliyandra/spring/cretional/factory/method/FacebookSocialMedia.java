package fadliyandra.spring.cretional.factory.method;


import jdk.jfr.DataAmount;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Deprecated
public class FacebookSocialMedia implements SocialMedia{

@Getter
private final String name = "FACEBOOK";

@Getter
private final String link = "https://facebook.com";

@Getter
private final SocialMediaType type =SocialMediaType.FACEBOOK;

}
