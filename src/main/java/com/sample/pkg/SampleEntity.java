package com.sample.pkg;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Table")
public class SampleEntity {

	private boolean status;

	@Id
	private EntityKey key;

	public SampleEntity() {

	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public EntityKey getKey() {
		return key;
	}

	public void setKey(EntityKey key) {
		this.key = key;
	}

}
