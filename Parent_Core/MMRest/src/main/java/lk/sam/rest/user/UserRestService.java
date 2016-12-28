package lk.sam.rest.user;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lk.sam.common.entity.AppUser;
import lk.sam.common.util.AppliException;
import lk.sam.core.service.user.UserService;

@RestController
@RequestMapping("/userRestOperation")
public class UserRestService implements Serializable {
	private static final long serialVersionUID = 1208011184500024872L;
	@Autowired
	private UserService userService;
	@PostConstruct
	public void init(){
		System.out.println("UserRestService init method..");
	}
	
	@RequestMapping(value = "/getUserByName", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody AppUser getUserByName(@RequestBody AppUser user){
		AppUser as = new AppUser();
		as.setName("kamal");
		try {
			AppUser tempuser = userService.getUserByName(user.getName());
			System.out.println("output");
			return tempuser;
		} catch (AppliException e) {
			
		}
		return as;
	}
}
