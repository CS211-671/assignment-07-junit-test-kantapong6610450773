package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    UserList userList;
    @BeforeEach
    void init(){
        userList = new UserList();
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        userList.addUser("Pong", "password1");
        userList.addUser("Ping", "password2");
        userList.addUser("Pang", "password3");
        // TODO: find one of them
        User foundUser = userList.findUserByUsername("Ping");
        // TODO: assert that UserList found User
        assertEquals("Ping", foundUser.getUsername());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        userList.addUser("Pong", "password1");
        userList.addUser("Ping", "password2");
        userList.addUser("Pang", "password3");
        // TODO: change password of one user
        boolean changed = userList.changePassword("Pong", "password1", "newpassword");
        // TODO: assert that user can change password
        assertTrue(changed);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Pong", "password1");
        userList.addUser("Ping", "password2");
        userList.addUser("Pang", "password3");
        // TODO: call login() with correct username and password
        User user = userList.login("Pong", "password1");
        // TODO: assert that User object is found
        assertNotNull(user);
        assertEquals("Pong", user.getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        userList.addUser("Pong", "password1");
        userList.addUser("Ping", "password2");
        userList.addUser("Pang", "password3");
        // TODO: call login() with incorrect username or incorrect password
        User user = userList.login("Pong", "sazwxedcrftvgbhynujimko");
        // TODO: assert that the method return null
        assertNull(user);
    }

}