package lk.sam.core.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lk.sam.common.entity.AppUser;
import lk.sam.common.util.AppliException;
import lk.sam.dao.user.UserDao;


@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	public void saveUser(AppUser appUser) throws AppliException {
		try {
			userDao.saveUser(appUser);
		} catch (Exception e) {
			throw new AppliException("Erro in save user ", e);
		}
	}

	public void updateUser(AppUser appUser) throws AppliException {
		try {
			userDao.updateUser(appUser);
		} catch (Exception e) {
			throw new AppliException("Erro in update user ", e);
		}		
	}

	public void deleteUserByName(String name) throws AppliException {
		// TODO Auto-generated method stub
		
	}

	public AppUser getUserByName(String name) throws AppliException {
		try {
			return userDao.getUserByName(name);
		} catch (Exception e) {
			throw new AppliException("Erro in getUserByName ", e);
		}
	}

	public List<AppUser> getAllUser() throws AppliException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int findAge(int bdy){
		return ++bdy;
	}
	
}
