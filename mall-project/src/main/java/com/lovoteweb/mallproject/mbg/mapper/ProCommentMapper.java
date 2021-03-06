package com.lovoteweb.mallproject.mbg.mapper;

import com.lovoteweb.mallproject.mbg.model.ProComment;
import com.lovoteweb.mallproject.mbg.model.ProCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int countByExample(ProCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int deleteByExample(ProCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int insert(ProComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int insertSelective(ProComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    List<ProComment> selectByExampleWithBLOBs(ProCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    List<ProComment> selectByExample(ProCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    ProComment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByExampleSelective(@Param("record") ProComment record, @Param("example") ProCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") ProComment record, @Param("example") ProCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByExample(@Param("record") ProComment record, @Param("example") ProCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByPrimaryKeySelective(ProComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(ProComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pro_comment
     *
     * @mbggenerated Fri Jun 26 16:09:22 CST 2020
     */
    int updateByPrimaryKey(ProComment record);
}