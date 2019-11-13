package com.qf.domain;

public class RolePermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.role_per_id
     *
     * @mbg.generated
     */
    private Integer rolePerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.role_id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role_permission.per_id
     *
     * @mbg.generated
     */
    private Integer perId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated
     */
    public RolePermission(Integer rolePerId, Integer roleId, Integer perId) {
        this.rolePerId = rolePerId;
        this.roleId = roleId;
        this.perId = perId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated
     */
    public RolePermission() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.role_per_id
     *
     * @return the value of role_permission.role_per_id
     *
     * @mbg.generated
     */
    public Integer getRolePerId() {
        return rolePerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.role_per_id
     *
     * @param rolePerId the value for role_permission.role_per_id
     *
     * @mbg.generated
     */
    public void setRolePerId(Integer rolePerId) {
        this.rolePerId = rolePerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.role_id
     *
     * @return the value of role_permission.role_id
     *
     * @mbg.generated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.role_id
     *
     * @param roleId the value for role_permission.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role_permission.per_id
     *
     * @return the value of role_permission.per_id
     *
     * @mbg.generated
     */
    public Integer getPerId() {
        return perId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role_permission.per_id
     *
     * @param perId the value for role_permission.per_id
     *
     * @mbg.generated
     */
    public void setPerId(Integer perId) {
        this.perId = perId;
    }
}