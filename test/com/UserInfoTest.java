package com;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bfw.domain.UserInfo;
import com.bfw.mapper.UserInfoMapper;
import com.bfw.utils.DBFactory;

public class UserInfoTest {


	
	/**
	 * 通过接口找到SQL
	 */
	@Test
	public void add2(){
		SqlSession session = DBFactory.getSession();
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		UserInfo user = new UserInfo();
		user.setUserId(32);
		user.setUsername("张三31");
		user.setUserAge(18);
		user.setUserSex("男");
		
		int i = mapper.addUser(user);
		if(i>0){
			System.out.println("添加成功");
		}
		session.commit();
		session.close();
	}
	
	@Test
	public  void update(){
		SqlSession session = DBFactory.getSession();
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		UserInfo user = new UserInfo();
		user.setUserId(31);
		user.setUsername("张1");
		user.setUserAge(281);
		user.setUserSex("女");
		
		int i = mapper.updateUser(user);
		if(i>0){
			System.out.println("修改成功");
		}
		session.commit();
		session.close();
	}
	
	@Test
	public  void delete(){
		SqlSession session = DBFactory.getSession();
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		int i = mapper.deleteUser(32);
		if(i>0){
			System.out.println("删除成功");
		}
		session.commit();
		session.close();
	}
	
	@Test
	public void getUser(){
		SqlSession session = DBFactory.getSession();
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		UserInfo user = mapper.getUser(1);
		System.out.println(user);
	}

	
	@Test
	public void getAllUser(){
		SqlSession session = DBFactory.getSession();
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		List<UserInfo> list = mapper.getAlluser();
		for(UserInfo user:list){
			System.out.println(user);
		}
		
	}
	
	@Test
	public void getUser2(){
		SqlSession session = DBFactory.getSession();
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		HashMap map = mapper.getUser2(1);
		
		System.out.println(map.get("user_id"));
		System.out.println(map.get("user_name"));
		System.out.println(map.get("user_age"));
		System.out.println(map.get("user_sex"));
		System.out.println(map.get("user_brithday"));
	}
	
	
	@Test
	public void getAllUser2(){
		SqlSession session = DBFactory.getSession();
		UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
		
		List<HashMap> list = mapper.getAlluser2();
		
		for(HashMap map:list){
			System.out.print(map.get("user_id"));
			System.out.print(map.get("user_name"));
			System.out.print(map.get("user_age"));
			System.out.print(map.get("user_sex"));
			System.out.println(map.get("user_brithday"));
		}
	
	}
	
}
