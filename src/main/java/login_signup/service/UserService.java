package login_signup.service;

import login_signup.dto.UserDto;
import login_signup.model.User;

public interface UserService {
	
	User save (UserDto userDto);

	User findByEmail(String name);

}
 