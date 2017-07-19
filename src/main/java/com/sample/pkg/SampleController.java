package com.sample.pkg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@ComponentScan("com.sample.pkg")
public class SampleController {

	@Autowired
	SampleComponent component;

	@RequestMapping("/sendOption")
	public String update(@RequestParam(value = "option") String option) {
		if (option.equalsIgnoreCase("option1")) {
			component.updateStatus(true);
			return "Something was updated";
		} else if (option.equalsIgnoreCase("option2")) {
			component.updateStatus(false);
			return "Something else was updated";
		}
		return "You have entered in an option that is invalid. Please enter a valid option.";
	}

	@RequestMapping("/getOption")
	public String control() {

		if (component.getStatus()) {
			return "option1";
		} else if (!component.getStatus()) {
			return "option2";
		}
		return "error";
	}

}
