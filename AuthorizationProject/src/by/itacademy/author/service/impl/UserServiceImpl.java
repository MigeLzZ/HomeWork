package by.itacademy.author.service.impl;

import by.itacademy.author.dao.UserDao;
import by.itacademy.author.dao.impl.UserDaoImpl;
import by.itacademy.author.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao dao;
	{
		dao = new UserDaoImpl();
	}
	
	@Override
	public String getName(String login, String pass) {
		String name = dao.readName(login, pass);
		return name;
	}

}
