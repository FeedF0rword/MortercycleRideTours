package com.BCASKandy.MorterCycleTourPlanner.service;

import com.BCASKandy.MorterCycleTourPlanner.model.Role;
import com.BCASKandy.MorterCycleTourPlanner.model.User;
import com.BCASKandy.MorterCycleTourPlanner.model.UserInformation;
import com.BCASKandy.MorterCycleTourPlanner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.naming.AuthenticationException;
import java.util.List;

public class UserService implements UserFacade{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user, String actingUserName) throws AuthenticationException {
        return null;
    }

    @Override
    public User createUser(String userName, String password, String firstname, String lastname, Role role, String actingUserName)
            throws AuthenticationException {
        return null;
    }

    @Override
    public void deleteUser(Long id, String actingUserName) throws AuthenticationException {

    }

    @Override
    public User retrieveUser(Long id, String actingUserName) throws AuthenticationException {
        return null;
    }

    @Override
    public User retrieveByUserName(String username, String actingUserName) throws AuthenticationException {
        return null;
    }

    @Override
    public List<User> retrieveAllUsers(String actingUserName) throws AuthenticationException {
        return null;
    }

    @Override
    public List<User> retrieveLikeMatchingUsers(String surname, String firstname, String actingUserName) throws AuthenticationException {
        return null;
    }

    @Override
    public User updateUser(User User, String actingUserName) throws AuthenticationException {
        return null;
    }

    @Override
    public void deleteAllUsers(String actingUserName) throws AuthenticationException {

    }

    @Override
    public UserInformation getUserInfoByUserName(String userName, String actingUserName) throws AuthenticationException {
        return null;
    }

    @Override
    public void updateUserInfoByUserName(UserInformation updateUserInfo, String userName, String actingUserName) throws AuthenticationException {

    }

    @Override
    public void updatePasswordByUserName(String newPassword, String userName, String actingUserName) throws AuthenticationException {

    }

    @Override
    public void updateOldPasswordByUserName(String newPassword, String oldPassword, String userName, String actingUserName) throws AuthenticationException {

    }

    @Override
    public boolean checkPasswordByUserName(String password, String userName, String actingUserName) throws AuthenticationException {
        return false;
    }

    @Override
    public Boolean getInsuranceVerified(String userName, String actingUserName) throws AuthenticationException {
        return null;
    }

    @Override
    public void updateInsuranceVerified(boolean insuranceVerified, String userName, String actingUserName) throws AuthenticationException {

    }

    @Override
    public void updateUserRoleByUserName(Role newRole, String userName, String actingUserName) throws AuthenticationException {

    }

    @Override
    public Role getRoleByUserName(String userName) {
        return null;
    }

    @Override
    public List<User> retrieveAllUsers(List<Role> userRoles, String actingUserName) throws AuthenticationException {
        return null;
    }

    @Override
    public List<User> retrieveLikeMatchingUsers(String surname, String firstname, List<Role> userRoles, String actingUserName) throws AuthenticationException {
        return null;
    }
}
