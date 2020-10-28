package com.BCASKandy.MorterCycleTourPlanner.service;

import com.BCASKandy.MorterCycleTourPlanner.dao.UserDAO;
import com.BCASKandy.MorterCycleTourPlanner.model.InsuranceInformation;
import com.BCASKandy.MorterCycleTourPlanner.model.Role;
import com.BCASKandy.MorterCycleTourPlanner.model.User;
import com.BCASKandy.MorterCycleTourPlanner.model.UserInformation;
import com.BCASKandy.MorterCycleTourPlanner.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.naming.AuthenticationException;
import java.util.List;

public class UserFacadeImpl implements UserFacade{

    @Autowired
    private UserDAO userDAO;

    @Override
    public User createUser(User user, String actingUserName) throws AuthenticationException {
        //check Auth with actingUsername????
        User newUser = userDAO.create(user);
        return newUser;
    }

    @Override
    public User createUser(String userName, String password, String firstname, String lastname, Role role, String actingUserName)
            throws AuthenticationException {
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setRole(role);
        UserInformation info = new UserInformation();
        info.setFirstname(firstname);
        info.setSurname(lastname);
        user.setUserInfo(info);
        User newUser = userDAO.create(user);
        return newUser;
    }

    @Override
    public void deleteUser(Long id, String actingUserName) throws AuthenticationException {
        userDAO.delete(id);
    }

    @Override
    public User retrieveUser(Long id, String actingUserName) throws AuthenticationException {
        User user = userDAO.retrieve(id);
        return user;
    }

    @Override
    public User retrieveByUserName(String username, String actingUserName) throws AuthenticationException {
        User user = userDAO.retrieveByUserName(username);
        return user;
    }

    @Override
    public List<User> retrieveAllUsers(String actingUserName) throws AuthenticationException {
        List<User> userList = userDAO.retrieveAll();
        return userList;
    }

    @Override
    public List<User> retrieveLikeMatchingUsers(String surname, String firstname, String actingUserName) throws AuthenticationException {
        List<User> userList = userDAO.retrieveLikeMatching(surname, firstname);
        return userList;
    }

    @Override
    public User updateUser(User user, String actingUserName) throws AuthenticationException {
        User updatedUser = userDAO.update(user);
        return updatedUser;
    }

    @Override
    public void deleteAllUsers(String actingUserName) throws AuthenticationException {
//       check for the user role === ADMIN
        userDAO.deleteAll();

    }

    @Override
    public UserInformation getUserInfoByUserName(String userName, String actingUserName) throws AuthenticationException {
        User user = userDAO.retrieveByUserName(userName);
        UserInformation userInfo = user.getUserInfo();
        return userInfo;
    }

    @Override
    public void updateUserInfoByUserName(UserInformation updateUserInfo, String userName, String actingUserName)
            throws AuthenticationException {
        User user = userDAO.retrieveByUserName(userName);
        user.setUserInfo(updateUserInfo);
    }

    @Override
    public void updatePasswordByUserName(String newPassword, String userName, String actingUserName)
            throws AuthenticationException {
        User user = userDAO.retrieveByUserName(userName);
        user.setPassword(newPassword);

    }

    @Override
    public void updateOldPasswordByUserName(String newPassword, String oldPassword, String userName, String actingUserName)
            throws AuthenticationException {

    }

    @Override
    public boolean checkPasswordByUserName(String password, String userName, String actingUserName) throws AuthenticationException {
        User user = userDAO.retrieveByUserName(userName);
        if (user.getPassword() == password){
            return  true;
        }
        else {
            return false;
        }
    }

    @Override
    public Boolean getInsuranceVerified(String userName, String actingUserName) throws AuthenticationException {
        User user = userDAO.retrieveByUserName(userName);
        InsuranceInformation info = user.getInsuranceInformation();
        return info.getInsuranceVerified();

    }

    @Override
    public void updateInsuranceVerified(boolean insuranceVerified, String userName, String actingUserName) throws AuthenticationException {
        User user = userDAO.retrieveByUserName(userName);
        InsuranceInformation info = user.getInsuranceInformation();
        info.setInsuranceVerified(insuranceVerified);
    }

    @Override
    public void updateUserRoleByUserName(Role newRole, String userName, String actingUserName) throws AuthenticationException {
        User user = userDAO.retrieveByUserName(userName);
        user.setRole(newRole);

    }

    @Override
    public Role getRoleByUserName(String userName) {
        User user = userDAO.retrieveByUserName(userName);
        return user.getRole();
    }

    @Override
    public List<User> retrieveAllUsers(List<Role> userRoles, String actingUserName) throws AuthenticationException {
        //check for user Authority
        List<User> userList = userDAO.retrieveAll();
        return userList;
    }

    @Override
    public List<User> retrieveLikeMatchingUsers(String surname, String firstname, List<Role> userRoles,
                                                String actingUserName) throws AuthenticationException
    {
        List<User> userList = userDAO.retrieveLikeMatching(surname,firstname, userRoles);
        return userList;
    }
}
