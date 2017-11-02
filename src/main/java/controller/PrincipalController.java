package controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PrincipalController {
    RestTemplate rt = new RestTemplate();

    @GetMapping
    public String getAccounts() {
        RestTemplate rt = new RestTemplate();
        String s =  rt.getForObject("https://api.github.com/users/defunkt",String.class);
        //System.err.println(s);
        return s;
    }
}
