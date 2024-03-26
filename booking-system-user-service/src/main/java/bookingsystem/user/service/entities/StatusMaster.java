package bookingsystem.user.service.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@jakarta.persistence.Entity
@Table(name="STATUS_MASTR")
public class StatusMaster extends AbstractEntityClass{
	
	@Column(name="STATUS_NAME", nullable = false, unique = true, length = 255)
	private String statusName;
	
	@Column(name="CREATED_BY", nullable = false)
	private LocalDateTime createdBy;

	@Column(name="CREATED_BY_USR", nullable = false)
	private String createdByUser;
	
	@Column(name="UPDATED_BY")
	private LocalDateTime updatedBy;
	
	@Column(name="UPDATED_BY_USR")
	private String updatedByUser;

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
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
	
	
}
