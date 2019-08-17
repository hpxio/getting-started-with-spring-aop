package com.app.rc.gettingStartedWithSpringAop;

import com.app.rc.gettingStartedWithSpringAop.service.UserProfileManagerService;
import com.app.rc.gettingStartedWithSpringAop.shared.dto.UserProfileDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class GettingStartedWithSpringAopApplication implements CommandLineRunner {

  private final UserProfileManagerService service;

  @Autowired
  public GettingStartedWithSpringAopApplication(UserProfileManagerService userProfileManagerService) {
    this.service = userProfileManagerService;
  }

  public static void main(String[] args) {
    SpringApplication.run(GettingStartedWithSpringAopApplication.class, args);
  }

  @Override
  public void run(String... args) {
    log.info("Create Record-1 : {}",
        service.CreateUserProfile(new UserProfileDTO(0, (byte) 0, "*AAAA", "Technology", true)));
  }
}
