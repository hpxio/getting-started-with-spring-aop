package com.app.rc.gettingStartedWithSpringAop.persistence.entity;

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
public class UserProfileEntity {

  /* ID will be auto-gen and should respect index-order increment */
  private int id;

  /* Role can be 0, 1 or 2 : 0 - Junior, 1 - Lead, 2 - Manager */
  private byte role;

  private String name;
  private String dept;

  /* Truth of this field signifies profile is active */
  private boolean status;
}
