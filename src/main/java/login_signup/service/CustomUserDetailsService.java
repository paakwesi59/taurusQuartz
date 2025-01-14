package login_signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import login_signup.repositories.UserRepository;
import login_signup.model.*;
@Service 

public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = (User) userRepository.findByEmail(username);
		
		if (user == null) {
			
			throw new UsernameNotFoundException("user not found");
		}
		
		return new CustomUserDetail(user);
	}

}
