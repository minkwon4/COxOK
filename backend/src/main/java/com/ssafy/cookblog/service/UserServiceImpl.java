package com.ssafy.cookblog.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.cookblog.dao.UserDao;
import com.ssafy.cookblog.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	
	//회원가입
	@Transactional
	public int register(UserDto user) {
		return userDao.insert(user);
	}
	
	//회원조회
	public UserDto findUserByEmail(String email) {
		return userDao.select(email);
	}
	public UserDto findUserByNickname(String nickname) {
		return userDao.selectNickname(nickname);
	}
	public List<UserDto> findAllUser() {
		return userDao.selectAll();
	}
	public UserDto login(UserDto user) {
		return userDao.login(user);
	}
	public long userIdByEmail(String email) {
		return userDao.userIdByEmail(email);
	}
	
	//회원수정
	@Transactional
	public int modify(UserDto user) {
		return userDao.update(user);
	}
	
	@Transactional
	public int authEmail(UserDto user) {
		return userDao.updateEmail(user);
	}

	//회원삭제
	@Transactional
	public int remove(String email) {
		return userDao.delete(email);
	}
	
}
