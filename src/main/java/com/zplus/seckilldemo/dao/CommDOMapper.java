package com.zplus.seckilldemo.dao;

import com.zplus.seckilldemo.DO.CommDO;
import com.zplus.seckilldemo.service.model.CommModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity
     *
     * @mbg.generated Fri Mar 15 14:17:34 CST 2019
     */
    int deleteByPrimaryKey(Integer commId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity
     *
     * @mbg.generated Fri Mar 15 14:17:34 CST 2019
     */
    int insert(CommDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity
     *
     * @mbg.generated Fri Mar 15 14:17:34 CST 2019
     */
    int insertSelective(CommDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity
     *
     * @mbg.generated Fri Mar 15 14:17:34 CST 2019
     */
    CommDO selectByPrimaryKey(Integer commId);

    List<CommModel> selectCommList();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity
     *
     * @mbg.generated Fri Mar 15 14:17:34 CST 2019
     */
    int updateByPrimaryKeySelective(CommDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commodity
     *
     * @mbg.generated Fri Mar 15 14:17:34 CST 2019
     */
    int updateByPrimaryKey(CommDO record);

    void increaseSales(Integer commId,Integer quantityPurchased);
}