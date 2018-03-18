/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.asyf.bms.modules.edu.dao;

import com.asyf.bms.common.persistence.CrudDao;
import com.asyf.bms.common.persistence.annotation.MyBatisDao;
import com.asyf.bms.modules.edu.entity.Student;

/**
 * 学生管理DAO接口
 * @author yjz
 * @version 2018-03-17
 */
@MyBatisDao
public interface StudentDao extends CrudDao<Student> {
	
}