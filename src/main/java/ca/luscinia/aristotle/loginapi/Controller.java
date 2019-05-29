package ca.luscinia.aristotle.loginapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {
	private static final String template = "{value: %s, status: %s}";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/uuid")
	public UUID uuid(@RequestParam(value = "username", defaultValue = "anonymous") String username) {
		return new UUID(counter.incrementAndGet(), String.format(template, username, "completed"));
	}
}
