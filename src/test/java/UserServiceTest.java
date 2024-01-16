import org.example.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testRegisterUser() {
        // First of all create the mock Repository
        UserRepository userRepository = mock(UserRepository.class);

        // Create a new object of the method with the mocking
        UserService userService = new UserService(userRepository);

        // Create a new object to insert the data
        User user = new User("Shubham");

        // Mocking the behaviour by using when and return
        when(userRepository.findByUsername("Shubham")).thenReturn(null);

        // call the method under the mocking object
        boolean result = userService.registerUser(user);

        // verify the mocking to see if that called or not
        verify(userRepository, times(1)).save(user);

        // Printing the result
        assert(result);
    }
}

