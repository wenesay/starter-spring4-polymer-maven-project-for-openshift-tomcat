/**
 * 
 */
package example.controller;

import java.util.Collections;
import java.util.Map;
import java.util.UUID;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import example.model.Message;

/**
 * @author Girishn
 *
 */
@RestController
public class WebController {

	@RequestMapping(value = "/hello/{player}")
	public Message message(@PathVariable String player) {
		Message msg = new Message(player, "Hello " + player);
		return msg;
	}

	@RequestMapping(value = "/random")
	public Map<String, String> token(Model model) {
		return Collections.singletonMap("id", UUID.randomUUID().toString());
	}

	@RequestMapping(value = "/hello")
	public String message() {
		return "hello";
	}
}
