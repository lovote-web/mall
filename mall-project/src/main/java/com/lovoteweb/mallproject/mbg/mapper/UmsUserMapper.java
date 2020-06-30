package com.lovoteweb.mallproject.mbg.mapper;

import com.lovoteweb.mallproject.mbg.model.UmsUser;
import com.lovoteweb.mallproject.mbg.model.UmsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int countByExample(UmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int deleteByExample(UmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int insert(UmsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int insertSelective(UmsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    List<UmsUser> selectByExample(UmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    UmsUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByExampleSelective(@Param("record") UmsUser record, @Param("example") UmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByExample(@Param("record") UmsUser record, @Param("example") UmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByPrimaryKeySelective(UmsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ums_user
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByPrimaryKey(UmsUser record);
}