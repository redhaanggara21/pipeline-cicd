package com.red21;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check-health/")
public class CheckController {
    

    @GetMapping("index/")
	public String message(){
		return "welcome to java ci/cd";
	}
    
}
