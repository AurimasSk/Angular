package lt.aurimas.angular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemsController {

    @RequestMapping("/")
    public String homepage() {
    	System.out.print("YEAH");
        return "items";
    }
	
}
