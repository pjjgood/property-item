package com.qf.dao;

import com.qf.bean.PageBean;
import com.qf.bean.StaffAndRole;
import com.qf.domain.Staff;
import com.qf.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StaffMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    int insert(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    int insertSelective(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    Staff selectByPrimaryKey(Integer staffId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Staff record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Staff record);

    Staff findByStaffNumber(String staffNumber);

    int updatePassword(Staff staff);

    //马浩雲写的……start
    Staff selectStaffByStaffNumber(String staffNumber);
    //马浩雲写的……end




}