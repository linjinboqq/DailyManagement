package dailymanagement.demo.dao;

import dailymanagement.demo.bean.Brainstorm;

public interface BrainstormMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Brainstorm record);

    int insertSelective(Brainstorm record);

    Brainstorm selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Brainstorm record);

    int updateByPrimaryKey(Brainstorm record);
}