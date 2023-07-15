package com.springrest.springrest.service;

import java.util.Iterator;
//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.UserDao;
import com.springrest.springrest.entities.User;

@Service
public class UserServiceIMPL implements UserService {
	
//	List<User> list;
	@Autowired
	private UserDao userDao;
	
	public UserServiceIMPL() {
//		list = new ArrayList<>();	
//		list.add(new User(1,"Shuvam Mondal","Here I am"));
//		list.add(new User(2,"Arjun Rai","Where are you"));
//		list.add(new User(3,"#######","No need to know"));
//		list.add(new User(4,"This is Nowhere","Why are you hiding"));
//		list.add(new User(5,"This is Nothing","No one can find me"));
	}

	@Override
	public List<User> getUsers() {
		
		return userDao.findAll();
	}

	@Override
	public User getUsersByUsers(String username) {
		User ss =  new User();
		List<User> all = userDao.findAll();
		for (int i = 0; i < all.size(); i++) {
			if (all.get(i).getUsername().equals(username)) {
				 ss = all.get(i);
				//  System.out.println(ss);
				// break;
				return ss;
			}
			//  System.out.println(all.get(i));
		}
		// System.out.println(ss);
		return ss;
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getUser(long userID) {
//		User c =null;
//		for (User user:list) {
//			if (user.getId() == userID) {
//				c = user;
//				break;
//			}
//		}
		return userDao.getOne(userID);
	}

	@Override
	public User addUser(User user) {
		
		List<User> ss = userDao.findAll();
		
		for (int i = 0; i < ss.size(); i++) {
			if (ss.get(i).getUsername().equals(user.getUsername())) {
//				System.out.print(0);
				return null;
			}
		}
		userDao.save(user);
		return user;
		
	}

	@Override
	public User UpdateUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public void deleteUser(long userID) {
		
		@SuppressWarnings("deprecation")
		User entity = userDao.getOne(userID);
		userDao.delete(entity);
//		list=this.list.stream().filter(e->e.getId()!=userID).collect(Collectors.toList());
		
	}

}
