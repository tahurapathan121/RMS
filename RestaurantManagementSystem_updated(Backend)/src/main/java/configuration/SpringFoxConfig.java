package configuration;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EnableSwagger2
@Configuration
//@Import(SpringDataRestConfiguration.class)
//@EnableWebMvc
public class SpringFoxConfig 
{

	@Bean
	public Docket api() 
	{
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				.securityContexts(Arrays.asList(securityContext())).securitySchemes(Arrays.asList(apiKey())).select()
				.apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
	}

    public static final String AUTHORIZATION_HEADER = "Authorization";

    private ApiKey apiKey() 
    {
        return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
    }

    private ApiInfo apiInfo() 
    {
        return new ApiInfo(
                "RMS API",
                "RMS for REST API Documentation",
                "1.0",
                "Terms of service",
                new springfox.documentation.service.Contact("Tahura Pathan", "RMS", "pathantahura@gmail.com"),
                "License of API",
                "API license URL",
                Collections.emptyList());
    }

    private SecurityContext securityContext() 
    {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .build();
    }

    private List<SecurityReference> defaultAuth() 
    {
        springfox.documentation.service.AuthorizationScope authorizationScope = new springfox.documentation.service.AuthorizationScope("global", "accessEverything");
        springfox.documentation.service.AuthorizationScope[] authorizationScopes = new springfox.documentation.service.AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return Arrays.asList(new springfox.documentation.service.SecurityReference("JWT", authorizationScopes));
    }
}


