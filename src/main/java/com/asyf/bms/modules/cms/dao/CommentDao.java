/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.asyf.bms.modules.cms.dao;

import com.asyf.bms.common.persistence.annotation.MyBatisDao;
import com.asyf.bms.modules.cms.entity.Comment;
import com.asyf.bms.common.persistence.CrudDao;

/**
 * 评论DAO接口
 * @author ThinkGem
 * @version 2013-8-23
 */
@MyBatisDao
public interface CommentDao extends CrudDao<Comment> {

}
