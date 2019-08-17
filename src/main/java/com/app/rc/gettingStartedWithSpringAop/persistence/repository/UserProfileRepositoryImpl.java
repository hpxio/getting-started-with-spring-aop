package com.app.rc.gettingStartedWithSpringAop.persistence.repository;

import com.app.rc.gettingStartedWithSpringAop.persistence.entity.UserProfileEntity;

import org.springframework.stereotype.Repository;

@Repository
public class UserProfileRepositoryImpl implements UserProfileRepository {

  @Override
  public void save(UserProfileEntity entity) {
    dataStore.add(entity);
  }

  @Override
  public UserProfileEntity fetch(int id) {
    return dataStore.get(id);
  }
}
