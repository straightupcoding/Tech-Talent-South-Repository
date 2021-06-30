package com.tts.UsersAPI.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
	List<User> findByStateResidence(@Param("stateResidence") String stateResidence);
}
