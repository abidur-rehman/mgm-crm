package uk.co.itsolutions.mgm.crm.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig extends RouteBuilder {
    public static final String CAMEL_SERVLET_NAME = "CamelServlet";

    @Value("${server.contextPath:/}")
    private String serverContextPath;

    @Bean
    ServletRegistrationBean camelServletRegistrationBean() {
        ServletRegistrationBean servlet = new ServletRegistrationBean();
        servlet.setName(CAMEL_SERVLET_NAME);
        servlet.setServlet(new CamelHttpTransportServlet());
        servlet.addUrlMappings(serverContextPath + "rest/*");
        return servlet;
    }

    /**
     * This is global configuration for binding incoming and outgoing messages to
     * different content types such as JSON - POJO / POJO - XML etc
     * @throws Exception
     */
    @Override
    public void configure() throws Exception {
        restConfiguration()
                .contextPath("/rest")
                .bindingMode(RestBindingMode.json);
    }
}
