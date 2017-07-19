package com.sample.pkg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SampleComponent {

	@Autowired
	SampleService service;

	public void updateStatus(boolean status) {
		service.saveStatus(status);
	}

	public boolean getStatus() {
		return service.getUpdate().getStatus();
	}
}
