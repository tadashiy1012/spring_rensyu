package tadashiy;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {
  public String getMessage() {
    return "Hello World!";
  }
}