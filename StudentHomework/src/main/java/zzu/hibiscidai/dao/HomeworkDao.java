package zzu.hibiscidai.dao;

import zzu.hibiscidai.entity.Homework;

public interface HomeworkDao {
	int deleteByPrimaryKey(Integer h_id);

	int insert(Homework record);

	int insertSelective(Homework record);

	Homework selectByPrimaryKey(Integer h_id);

	int updateByPrimaryKeySelective(Homework record);

	int updateByPrimaryKeyWithBLOBs(Homework record);

	int updateByPrimaryKey(Homework record);
}