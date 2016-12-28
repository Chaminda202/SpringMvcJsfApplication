package lk.sam.core.service.user;

import java.util.List;
import lk.sam.common.entity.AppUser;
import lk.sam.common.util.AppliException;

public interface UserService {
	public void saveUser(AppUser appUser) throws AppliException;
	public void updateUser(AppUser appUser) throws AppliException;
	public void deleteUserByName(String name) throws AppliException;
	public AppUser getUserByName(String name) throws AppliException;
	public List<AppUser> getAllUser() throws AppliException;
}
