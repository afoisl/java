package March.Java0328;

import java.time.LocalDate;

public class User {
    String name;
    LocalDate birth;
    String userID;
    String userPW;
    int iden;
    int phoneNum;
    String address;
    String email;

    public User() {
    }

    public User(String name, LocalDate birth, String userID, String userPW, int iden, int phoneNum, String address, String email) {
        this.name = name;
        this.birth = birth;
        this.userID = userID;
        this.userPW = userPW;
        this.iden = iden;
        this.phoneNum = phoneNum;
        this.address = address;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }

    public int getIden() {
        return iden;
    }

    public void setIden(int iden) {
        this.iden = iden;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                ", userID='" + userID + '\'' +
                ", userPW='" + userPW + '\'' +
                ", iden=" + iden +
                ", phoneNum=" + phoneNum +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
