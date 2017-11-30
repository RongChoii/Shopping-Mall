package com.nonage.dto;

import java.sql.Timestamp;
/*
 * 회원가입 <-- 데베에 저장된 member 테이블에 회원정보를 저장해야 한다.
 * 로그인 <-- 데베에서 가입한 회원인지를 조회, 확인해야한다.
 * 데베에서 얻어온 회원 정보를 담을 VO.
 */
public class MemberVO {
  private String id;
  private String pwd;
  private String name;
  private String email;
  private String zipNum;
  private String address;
  private String phone;
  private String useyn;
  private Timestamp indate;
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getPwd() {
    return pwd;
  }
  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  
  public String getZipNum() {
    return zipNum;
  }
  public void setZipNum(String zipNum) {
    this.zipNum = zipNum;
  }
  
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
  public String getUseyn() {
    return useyn;
  }
  public void setUseyn(String useyn) {
    this.useyn = useyn;
  }
  public Timestamp getIndate() {
    return indate;
  }
  public void setIndate(Timestamp indate) {
    this.indate = indate;
  }
}
