package zzu.hibiscidai.dao;

import zzu.hibiscidai.entity.Student;

public interface StudentStudentDao {
	int deleteByPrimaryKey(Integer s_id);

	int insert(Student record);

	int insertSelective(Student record);

	Student selectByPrimaryKey(Integer s_id);

	int updateByPrimaryKeySelective(Student record);

	int updateByPrimaryKey(Student record);
}