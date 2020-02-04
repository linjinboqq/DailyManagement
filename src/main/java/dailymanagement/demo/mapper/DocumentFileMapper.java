package dailymanagement.demo.mapper;

import dailymanagement.demo.bean.DocumentFile;

public interface DocumentFileMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(DocumentFile record);

    int insertSelective(DocumentFile record);

    DocumentFile selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(DocumentFile record);

    int updateByPrimaryKey(DocumentFile record);
}