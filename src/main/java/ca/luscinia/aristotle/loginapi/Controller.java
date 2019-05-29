package ca.luscinia.aristotle.loginapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {
	private static final String template = "{index: %s, database: %s}";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/uuid")
	public UUID resource(@RequestParam(value = "id", defaultValue = "0") int reqid, @RequestParam(value = "db", defaultValue = "0") int dbid) {
		return new UUID(counter.incrementAndGet(), String.format(template, reqid, dbid));
	}
}
