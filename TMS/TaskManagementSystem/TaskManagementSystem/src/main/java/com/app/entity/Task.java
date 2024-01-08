package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "taskmanagement")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Task_Id")
	private int Task_id;

	@Column(name = "Task_Name")
	private String Task_Name;

	@Column(name = "Task_Description")
	private String Task_description;

	@Column(name = "Task_Status")
	private boolean Task_status;

	public int getTask_id() {
		return Task_id;
	}

	public void setTask_id(int task_id) {
		Task_id = task_id;
	}

	public String getTask_Name() {
		return Task_Name;
	}

	public void setTask_Name(String task_Name) {
		Task_Name = task_Name;
	}

	public String getTask_description() {
		return Task_description;
	}

	public void setTask_description(String task_description) {
		Task_description = task_description;
	}

	public boolean isTask_status() {
		return Task_status;
	}

	public void setTask_status(boolean task_status) {
		Task_status = task_status;
	}

	public Task() {

	}

	public Task(int task_id, String task_Name, String task_description, boolean task_status) {
		super();
		Task_id = task_id;
		Task_Name = task_Name;
		Task_description = task_description;
		Task_status = task_status;
	}

	@Override
	public String toString() {
		return "Task [Task_id=" + Task_id + ", Task_Name=" + Task_Name + ", Task_description=" + Task_description
				+ ", Task_status=" + Task_status + "]";
	}

}
