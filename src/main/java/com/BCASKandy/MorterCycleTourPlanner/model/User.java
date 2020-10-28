package com.BCASKandy.MorterCycleTourPlanner.model;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name="User")
@EntityListeners(AuditingEntityListener.class)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
    /**
     * Defines the User Entity has Embedded attributes User Information, Insurance Information,
     * Insurance Details
     * User Has a Role defined by Enumerator object Role
     * Defines the attributes
     * <ul>
     *     <li>Id <i>Auto Generated</i> <li/>
     *     <li>role<li/>
     *     <li>username <i>Unique</i> <li/>
     *     <li>password<li/>
     *     <li>passwordHash<li/>
     *     <li>Insurance Details<li/>
     *     <li>User Details<li/>
     *
     * <ul/>
     * <p>
     *     This Class also contain getters and setter for each of these attributes.<br>
     *     toString method returns the all User details  as a string value
     *
     * <p/>
     */
    private Long Id;

    private Role role;

    private String userName;

    private String passWordHash;

    private String password =null;

    private InsuranceInformation insuranceInformation = new InsuranceInformation();

    private UserInformation userInformation = new UserInformation();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    // all usernames are unique
    @Column(unique = true)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWordHash() {
        return passWordHash;
    }

    public void setPassWordHash(String passWordHash) {
        this.passWordHash = passWordHash;
    }

    //For Security Reasons the passwords are hashed and saved in the database
    @Transient
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Embedded
    public InsuranceInformation getInsuranceInformation() {
        return insuranceInformation;
    }

    public void setInsuranceInformation(InsuranceInformation insuranceInformation) {
        this.insuranceInformation = insuranceInformation;
    }

    @Embedded
    public UserInformation getUserInfo() {
        return userInformation;
    }

    public void setUserInfo(UserInformation userInfo) {
        this.userInformation = userInfo;
    }


    @Override
    public String toString() {
        /**
         * Returns the user information in string form *
         */
        return "SysUser{" + "Id=" + Id
                + ", role=" + role
                + ", userName=" + userName
                + ", passWordHash=" + ((passWordHash == null) ? "null" : "***set but not shown***")
                + ", password=" + ((password == null) ? "null" : "***set but not shown***")
                + ", InsuranceInformation=" + insuranceInformation
                + ", userInfo=" + userInformation + '}';
    }
}
