package lt.aurimas.angular.core;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/*
 * The following class extends WebMvcConfigurerAdapter to customise the java-based configuration for SpringMVC. 
 * It is as opposed to the mvc-dispatcher.xml. 
 * To configure the resources and viewResolver, addResourceHandlers and getViewResolver are overridden as below.
 */
public class WebAppInitializer implements WebApplicationInitializer {

    private static final String CONFIG_LOCATION = "lt.aurimas.angular.config";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        System.out.println("***** Initializing Application for " + servletContext.getServerInfo() + " *****");

        // Create ApplicationContext
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.setConfigLocation(CONFIG_LOCATION);

        // Add the servlet mapping manually and make it initialize automatically
        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);
        ServletRegistration.Dynamic servlet = servletContext.addServlet("mvc-dispatcher", dispatcherServlet);

        servlet.addMapping("/");
        servlet.setAsyncSupported(true);
        servlet.setLoadOnStartup(1);
    }
}