package com.app.rc.gettingStartedWithSpringAop.service;

import com.app.rc.gettingStartedWithSpringAop.persistence.entity.UserProfileEntity;
import com.app.rc.gettingStartedWithSpringAop.persistence.repository.UserProfileRepository;
import com.app.rc.gettingStartedWithSpringAop.shared.dto.UserProfileDTO;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileManagerServiceImpl implements UserProfileManagerService {

  private final UserProfileRepository repository;

  @Autowired
  public UserProfileManagerServiceImpl(UserProfileRepository userProfileRepository) {
    this.repository = userProfileRepository;
  }

  /**
   * @param data
   * @return
   */
  @Override
  public boolean CreateUserProfile(UserProfileDTO data) {
    final boolean res;
    UserProfileEntity entity = new UserProfileEntity();
    BeanUtils.copyProperties(data, entity);
    repository.save(entity);

    res = repository.fetch(data.getId()) != null;
    return res;
  }

  @Override
  public boolean RemoveUserProfile(UserProfileDTO data) {
    return false;
  }
}
