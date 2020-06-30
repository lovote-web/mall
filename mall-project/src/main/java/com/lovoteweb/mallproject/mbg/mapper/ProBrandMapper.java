package com.lovoteweb.mallproject.mbg.mapper;

import com.lovoteweb.mallproject.mbg.model.ProBrand;
import com.lovoteweb.mallproject.mbg.model.ProBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProBrandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int countByExample(ProBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int deleteByExample(ProBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int insert(ProBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int insertSelective(ProBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    List<ProBrand> selectByExampleWithBLOBs(ProBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    List<ProBrand> selectByExample(ProBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    ProBrand selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByExampleSelective(@Param("record") ProBrand record, @Param("example") ProBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") ProBrand record, @Param("example") ProBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByExample(@Param("record") ProBrand record, @Param("example") ProBrandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByPrimaryKeySelective(ProBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(ProBrand record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_brand
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByPrimaryKey(ProBrand record);
}