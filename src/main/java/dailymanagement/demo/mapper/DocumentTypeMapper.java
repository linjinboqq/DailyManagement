package dailymanagement.demo.mapper;

import dailymanagement.demo.bean.DocumentType;

public interface DocumentTypeMapper {
    int deleteByPrimaryKey(String doctype);

    int insert(DocumentType record);

    int insertSelective(DocumentType record);
}