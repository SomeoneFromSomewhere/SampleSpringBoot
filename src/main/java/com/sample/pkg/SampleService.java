package com.sample.pkg;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SampleService {

	@Autowired
	SampleRepository repository;

	public SampleEntity getUpdate() {
		return repository.getRecent();
	}

	@Transactional
	public void saveStatus(boolean status) {
		SampleEntity door = new SampleEntity();
		EntityKey key = new EntityKey();

		key.setEntityId(1);
		key.setUpTime(new Timestamp(new Date().getTime()));

		door.setKey(key);
		door.setStatus(status);
		repository.save(door);
	}
}
