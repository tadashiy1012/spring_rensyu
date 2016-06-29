package tadashiy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App {
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
    ctx.getBean(HelloWorldPrinter.class).run();
  }
}