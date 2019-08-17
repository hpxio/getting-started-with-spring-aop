package com.app.rc.gettingStartedWithSpringAop.shared.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserProfileDTO {

  private int id;
  private byte role;
  private String name;
  private String dept;
  private boolean status;
}
