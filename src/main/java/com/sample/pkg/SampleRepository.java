package com.sample.pkg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Integer> {

	@Query(value = "select * from table", nativeQuery = true)
	public SampleEntity getRecent();

}
