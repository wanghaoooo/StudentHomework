package zzu.hibiscidai.dao;

import zzu.hibiscidai.entity.Teacher;

public interface TeacheTeacherDao {
	int deleteByPrimaryKey(Integer s_id);

	int insert(Teacher record);

	int insertSelective(Teacher record);

	Teacher selectByPrimaryKey(Integer s_id);

	int updateByPrimaryKeySelective(Teacher record);

	int updateByPrimaryKey(Teacher record);
}