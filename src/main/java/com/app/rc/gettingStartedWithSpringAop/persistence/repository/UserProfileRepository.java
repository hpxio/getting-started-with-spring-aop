package com.app.rc.gettingStartedWithSpringAop.persistence.repository;

import com.app.rc.gettingStartedWithSpringAop.persistence.entity.UserProfileEntity;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface UserProfileRepository {

  static List<UserProfileEntity> dataStore = new ArrayList<>();

  void save(UserProfileEntity entity);

  UserProfileEntity fetch(int id);
}
