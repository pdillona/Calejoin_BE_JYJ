package kr.co.calejoin.controller.member;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping(value = {"/index","/"})
    public String index(Authentication authentication){

        /* if(authentication.isAuthenticated()){
            return "redirect:/";
        }else {
            return "redirect:/index";
        }*/
        return "/index";
    }
    
    
}
