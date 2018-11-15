package io.swagger;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.event.ApplicationReadyEvent;

@Component
public class Info {
	
	@EventListener(ApplicationReadyEvent.class)
	  public void contextRefreshedEvent() {
	    System.out.println("The following endpoints are available by default :-");
	    System.out.println("  OpenAPI UI    : http://localhost:8080/swagger-ui.html");
	    System.out.println("  OpenAPI json  : http://localhost:8080/swagger/api");
	  }

}