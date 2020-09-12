package amk.dev.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amk.dev.entity.AbstractUser;
import amk.dev.exception.UserNotFoundException;
import amk.dev.repo.AbstractRepo;

@Service
public class AbstractService {

	@Autowired
	AbstractRepo repo;
	
	public AbstractUser getUserInfo(long userId) throws UserNotFoundException {
		Optional<AbstractUser> user = repo.findById(userId);
		if(!user.isPresent()) {
			throw new UserNotFoundException("User not found with id: "+userId);
		}
		return user.get();
	}
	
	public AbstractUser saveUserInfo(AbstractUser user) {
		repo.save(user);
		return user;
	}
}
