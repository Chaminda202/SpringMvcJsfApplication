package lk.sam.dao.user;

import java.util.List;

import lk.sam.common.entity.AppUser;

public interface UserDao {
	public void saveUser(AppUser appUser) throws Exception;
	public void updateUser(AppUser appUser) throws Exception;
	public void deleteUserByName(String name) throws Exception;
	public AppUser getUserByName(String name) throws Exception;
	public List<AppUser> getAllUser() throws Exception;
}
