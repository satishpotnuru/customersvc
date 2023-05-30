package com.mc.kube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    Logger logger = Logger.getLogger("CustomerController");

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable("id") String id){
       logger.info(" Request for customer : "+ id);
        return "Customer-"+ id;
    }
}
