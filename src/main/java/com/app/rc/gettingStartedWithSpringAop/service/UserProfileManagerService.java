package com.app.rc.gettingStartedWithSpringAop.service;

import com.app.rc.gettingStartedWithSpringAop.shared.dto.UserProfileDTO;

public interface UserProfileManagerService {

  boolean CreateUserProfile(UserProfileDTO data);

  boolean RemoveUserProfile(UserProfileDTO data);
}
