package com.BCASKandy.MorterCycleTourPlanner.service;


import com.BCASKandy.MorterCycleTourPlanner.model.Role;
import com.BCASKandy.MorterCycleTourPlanner.model.User;
import com.BCASKandy.MorterCycleTourPlanner.model.UserInformation;

import javax.naming.AuthenticationException;
import java.util.List;

public interface UserFacade {
    User createUser(User user, String actingUserName)
            throws AuthenticationException;

    User createUser(String userName, String password, String firstname, String lastname,
                    Role role, String actingUserName)
            throws AuthenticationException;

    void deleteUser(Long id, String actingUserName)
            throws AuthenticationException;

    User retrieveUser(Long id, String actingUserName)
            throws AuthenticationException;

    User retrieveByUserName(String username, String actingUserName)
            throws AuthenticationException;

    List<User> retrieveAllUsers(String actingUserName)
            throws AuthenticationException;

    List<User> retrieveLikeMatchingUsers(String surname, String firstname,
                                         String actingUserName)
            throws AuthenticationException;

    User updateUser(User User, String actingUserName)
            throws AuthenticationException;

    void deleteAllUsers(String actingUserName)
            throws AuthenticationException;

    UserInformation getUserInfoByUserName(String userName, String actingUserName)
            throws AuthenticationException;

    void updateUserInfoByUserName(UserInformation updateUserInfo,
                                  String userName, String actingUserName)
            throws AuthenticationException;

    void updatePasswordByUserName(String newPassword, String userName, String actingUserName)
            throws AuthenticationException;

    void updateOldPasswordByUserName(String newPassword, String oldPassword, String userName,
                                     String actingUserName)
            throws AuthenticationException;

    boolean checkPasswordByUserName(String password, String userName, String actingUserName)
            throws AuthenticationException;

    Boolean getInsuranceVerified(String userName, String actingUserName)
            throws AuthenticationException;

    void updateInsuranceVerified(boolean insuranceVerified, String userName, String actingUserName)
            throws AuthenticationException;

    void updateUserRoleByUserName(Role newRole, String userName, String actingUserName)
            throws AuthenticationException;

    Role getRoleByUserName(String userName);

    List<User> retrieveAllUsers(List<Role> userRoles, String actingUserName)
            throws AuthenticationException;

    List<User> retrieveLikeMatchingUsers(String surname, String firstname,
                                         List<Role> userRoles, String actingUserName)
            throws AuthenticationException;
}
