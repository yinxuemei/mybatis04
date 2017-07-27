package com.bfw.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bfw.domain.UserInfo;

public interface UserInfoMapper {

	/**
	 * 添加用户信息
	 * 
	 * @param user
	 * @return
	 */
	@Insert("insert into user_info (user_id,user_name,user_age,user_sex,user_brithday) values(#{userId},#{username},#{userAge},#{userSex},now())")
	public int addUser(UserInfo user);

	/**
	 * 修改用户信息
	 * 
	 * @param user
	 *            用户信息
	 * @return 返回影响行数
	 */
	@Update("update user_info set user_name=#{username},user_age=#{userAge},user_sex=#{userSex},user_brithday=now() where user_id = #{userId}")
	public int updateUser(UserInfo user);

	/**
	 * 根据编号删除用户信息
	 * 
	 * @param userId
	 *            编号
	 * @return 返回影响的行数
	 */
	@Delete("delete from user_info where user_id=#{userId}")
	public int deleteUser(Integer userId);

	/**
	 * 根据编号查询用户信息
	 * 
	 * @param userId
	 *            用户编号
	 * @return 返回用户信息
	 */
	@Select("select * from user_info where user_id = #{userId}")
	@Results(value={@Result(property="userId",column="user_id"),
			@Result(property="username",column="user_name"),
			@Result(property="userAge",column="user_age"),
			@Result(property="userSex",column="user_sex"),
			@Result(property="userBrithday",column="user_brithday"),
	})
	public UserInfo getUser(@Param("userId") Integer userId);
	
	/**
	 * 查询所有的记录
	 * 
	 * @return 返回多条用户信息
	 */
	@Select("select * from user_info")
	@Results(value={@Result(property="userId",column="user_id"),
			@Result(property="username",column="user_name"),
			@Result(property="userAge",column="user_age"),
			@Result(property="userSex",column="user_sex"),
			@Result(property="userBrithday",column="user_brithday"),
	})
	public List<UserInfo> getAlluser();
	
	/**
	 * 根据编号查询用户信息
	 * @param userId
	 * @return 返回HashMap
	 */
	@Select("select * from user_info where user_id = #{userId}")
	public HashMap getUser2(@Param("userId")Integer userId);
	
	
	/**
	 * 根据编号查询用户信息
	 * @param userId
	 * @return 返回HashMap
	 */
	@Select("select * from user_info ")
	public List<HashMap> getAlluser2();
	
}
