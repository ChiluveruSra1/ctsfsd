package springHibernate.springHbnDemo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("service")
public class UserServiceImpl implements UserSevice {
	private UserDao dao;

	@Autowired
	public UserServiceImpl(UserDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	@Transactional
	public UserDetails createUser(UserDetails user) {
		// TODO Auto-generated method stub
		return dao.createUser(user);
	}

}
