package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dto.UserDTO;
import com.app.dto.UserRegResponse;
import com.app.entities.UserEntity;
import com.app.repository.IProductListRepository;
import com.app.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	

	
	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public UserRegResponse registerUser(UserDTO user) {
	
		UserEntity userEntity = mapper.map(user, UserEntity.class);
		
		userEntity.setPassword(encoder.encode(user.getPassword()));
		
		UserEntity persistentUser = userRepo.save(userEntity);
		return new UserRegResponse("User registered successfully with ID " + persistentUser.getUserId());
	}
	

}
