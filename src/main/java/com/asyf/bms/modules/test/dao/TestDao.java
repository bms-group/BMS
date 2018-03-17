/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.asyf.bms.modules.test.dao;

import com.asyf.bms.common.persistence.annotation.MyBatisDao;
import com.asyf.bms.modules.test.entity.Test;
import com.asyf.bms.common.persistence.CrudDao;

/**
 * 测试DAO接口
 * @author ThinkGem
 * @version 2013-10-17
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {
	
}
