package bookingsystem.user.service.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name="ROLE_MASTR")
public class RoleMaster{
	
	/*
	 * Role_ID:  1 = SYSTEM
	 * Role_ID:  2 = ADMIN
	 * Role_ID:  3 = EMPLOYEE
	 * Role_ID:  4 = USER
	 * Role_ID:  5 = STAFF
	 * 
	 * **/
	
	@Id
	@Column(name="ROLE_ID", unique = true, nullable = false, updatable = false, length = 5)
	private Long roleId;
	
	@Column(name="ROLE_NAME", unique = true, nullable = false, updatable = false, length = 255)
	private String roleName;
	

	@Column(name="CREATED_BY", nullable = false)
	private LocalDateTime createdBy;

	@Column(name="CREATED_BY_USR", nullable = false)
	private String createdByUser;
	
	@Column(name="UPDATED_BY")
	private LocalDateTime updatedBy;
	
	@Column(name="UPDATED_BY_USR")
	private String updatedByUser;
	
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = StatusMaster.class)
	@JoinColumn(name = "fk_STATUS_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name="fk_STATUS_ID"))
	private StatusMaster status;


	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public LocalDateTime getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(LocalDateTime createdBy) {
		this.createdBy = createdBy;
	}


	public String getCreatedByUser() {
		return createdByUser;
	}


	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}


	public LocalDateTime getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(LocalDateTime updatedBy) {
		this.updatedBy = updatedBy;
	}


	public String getUpdatedByUser() {
		return updatedByUser;
	}


	public void setUpdatedByUser(String updatedByUser) {
		this.updatedByUser = updatedByUser;
	}


	public StatusMaster getStatus() {
		return status;
	}


	public void setStatus(StatusMaster status) {
		this.status = status;
	}
	
	
	
}
