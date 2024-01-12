package ru.register.auto.register10.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.register.auto.register10.models.Application;
import ru.register.auto.register10.services.AppService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/apps")
@AllArgsConstructor
public class AppController {
    private AppService service;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the home slaid";
    }
    @GetMapping("/all-app")
    public List<Application> allApplication(){
        return service.allApplications();
    }
    @GetMapping("/{id}")
    public Application applicationByID(@PathVariable int id){
        return service.applicationByID(id);
    }
}
