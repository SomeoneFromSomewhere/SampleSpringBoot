package com.sample.pkg;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Embeddable;

@Embeddable
public class EntityKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -645034117086245552L;
	private int entityId;
	private Timestamp upTime;

	public EntityKey() {

	}

	public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public Timestamp getUpTime() {
		return upTime;
	}

	public void setUpTime(Timestamp upTime) {
		this.upTime = upTime;
	}

}
