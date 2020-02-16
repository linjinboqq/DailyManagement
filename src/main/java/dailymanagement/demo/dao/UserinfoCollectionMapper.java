package dailymanagement.demo.dao;

import dailymanagement.demo.bean.UserinfoCollection;

public interface UserinfoCollectionMapper {
    int deleteByPrimaryKey(Integer ucid);

    int insert(UserinfoCollection record);

    int insertSelective(UserinfoCollection record);

    UserinfoCollection selectByPrimaryKey(Integer ucid);

    int updateByPrimaryKeySelective(UserinfoCollection record);

    int updateByPrimaryKey(UserinfoCollection record);
}