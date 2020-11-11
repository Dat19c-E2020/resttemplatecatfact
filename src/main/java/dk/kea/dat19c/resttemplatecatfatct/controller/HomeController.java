package dk.kea.dat19c.resttemplatecatfatct.controller;

import dk.kea.dat19c.resttemplatecatfatct.service.RestConsumeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Objects;

@Controller
public class HomeController {
    private RestConsumeService restConsumeService;

    public HomeController(RestConsumeService restConsumeService){
        this.restConsumeService = restConsumeService;
    }

    @GetMapping("/")
    public String getSingle(Model model){
        model.addAttribute("catFact", restConsumeService.fetchSingleCatFact());
        return "index";
    }

}
