/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.asyf.bms.test.dao;

import com.asyf.bms.common.persistence.annotation.MyBatisDao;
import com.asyf.bms.test.entity.TestDataMain;
import com.asyf.bms.common.persistence.CrudDao;

/**
 * 主子表生成DAO接口
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestDataMainDao extends CrudDao<TestDataMain> {
	
}