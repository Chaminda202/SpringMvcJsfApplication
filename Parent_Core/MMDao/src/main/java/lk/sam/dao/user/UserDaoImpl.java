package lk.sam.dao.user;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lk.sam.common.entity.AppUser;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void saveUser(AppUser appUser) throws Exception {
		this.sessionFactory.getCurrentSession().save(appUser);
	}

	@Transactional
	public void updateUser(AppUser appUser) throws Exception {
		this.sessionFactory.getCurrentSession().saveOrUpdate(appUser);
	}

	@Transactional
	public void deleteUserByName(String name) throws Exception {

	}

	@Transactional
	public AppUser getUserByName(String name) throws Exception {
		String query = "SELECT u FROM AppUser u WHERE u.name = :name";
		@SuppressWarnings("unchecked")
		List<AppUser> list = this.sessionFactory.getCurrentSession().createQuery(query).setString("name", name).list();
		return list.get(0);
	}

	@Transactional
	public List<AppUser> getAllUser() throws Exception {
		String query = "SELECT u FROM AppUser u";
		@SuppressWarnings("unchecked")
		List<AppUser> list = this.sessionFactory.getCurrentSession().createQuery(query).list();
		return list;
	}

}
