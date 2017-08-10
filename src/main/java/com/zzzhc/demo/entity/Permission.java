package com.zzzhc.demo.entity;

import org.joda.time.DateTime;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import javax.validation.constraints.NotNull;

import com.google.common.base.MoreObjects;

@Table
public class Permission {

	@Id
	private Long id;
	
	@Column
	@NotNull
	private String name;
	
	@Column
	private String description;
	
	@Column
	private DateTime updatedAt = DateTime.now();
	
	@Column
	private DateTime createdAt = DateTime.now();
	
	public void setId(Long id) {
		this.id = id;
	}
	 
	public Long getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	 
	public String getDescription() {
		return this.description;
	}

	public void setUpdatedAt(DateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	 
	public DateTime getUpdatedAt() {
		return this.updatedAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}
	 
	public DateTime getCreatedAt() {
		return this.createdAt;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("id", id).add("name", name)
			.add("description", description).add("updatedAt", updatedAt)
			.add("createdAt", createdAt).toString();
	}
}
