package lk.sam.web.user;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import lk.sam.common.entity.AppUser;
import lk.sam.common.util.AppliException;
import lk.sam.core.service.user.UserService;

@ManagedBean
@RequestScoped
public class UserController implements Serializable {
	private static final long serialVersionUID = 9045844994170729983L;
	@ManagedProperty("#{userService}")
	private UserService userService;
	private AppUser user = new AppUser();
	public String submit(){
		try {
			System.out.println("hiiii......");
			userService.saveUser(user);
		} catch (AppliException e) {
			e.printStackTrace();
		}
		return "";
	}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public AppUser getUser() {
		return user;
	}
	public void setUser(AppUser user) {
		this.user = user;
	}
}
