/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.asyf.bms.modules.sys.dao;

import com.asyf.bms.common.persistence.TreeDao;
import com.asyf.bms.common.persistence.annotation.MyBatisDao;
import com.asyf.bms.modules.sys.entity.Office;

/**
 * 机构DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
