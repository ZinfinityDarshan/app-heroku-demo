package app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/secure")
public class MainController {

	@GetMapping("/hi")
	public Mono<String> hi(){
		return Mono.just("Hi");
	}
}
