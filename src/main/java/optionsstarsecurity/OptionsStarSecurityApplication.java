package optionsstarsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OptionsStarSecurityApplication {

  public static void main(String[] args) {
    SpringApplication.run(OptionsStarSecurityApplication.class, args);
  }

  @GetMapping("/")
  public String index() {
    return String.format("Hello");
  }
}
