package com.neu.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table admin
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Admin {

	/**
	 * Database Column Remarks: 主键 This field was generated by MyBatis Generator. This field corresponds to the database column admin.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * Database Column Remarks: 管理员名 This field was generated by MyBatis Generator. This field corresponds to the database column admin.UserName
	 * @mbg.generated
	 */
	private String username;
	/**
	 * Database Column Remarks: 管理员密码 This field was generated by MyBatis Generator. This field corresponds to the database column admin.PassWord
	 * @mbg.generated
	 */
	private String password;
	/**
	 * Database Column Remarks: 登陆者身份 This field was generated by MyBatis Generator. This field corresponds to the database column admin.root
	 * @mbg.generated
	 */
	private Role role;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column admin.id
	 * @return  the value of admin.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column admin.id
	 * @param id  the value for admin.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column admin.UserName
	 * @return  the value of admin.UserName
	 * @mbg.generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column admin.UserName
	 * @param username  the value for admin.UserName
	 * @mbg.generated
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column admin.PassWord
	 * @return  the value of admin.PassWord
	 * @mbg.generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column admin.PassWord
	 * @param password  the value for admin.PassWord
	 * @mbg.generated
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column admin.root
	 * @return  the value of admin.root
	 * @mbg.generated
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column admin.root
	 * @param role  the value for admin.root
	 * @mbg.generated
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	
	
}