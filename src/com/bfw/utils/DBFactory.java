package com.bfw.utils;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBFactory {

	public static SqlSessionFactory sqlSessionFactory  = null;
	
	static{
		try {
			//创建SqlSessionFactory
			String resource = "mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader,"mysql");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取SqlSession
	 * @return
	 */
	public static SqlSession getSession(){
		
		return sqlSessionFactory.openSession();
	}

}
