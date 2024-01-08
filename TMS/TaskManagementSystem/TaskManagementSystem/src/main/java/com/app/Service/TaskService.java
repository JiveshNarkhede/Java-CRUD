package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Task;
import com.app.Repo.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public Task getTaskById(int id)
	{
		return taskRepository.findById(id).orElse(null);
	}
	public List<Task> getAllTasks()
	{
		return taskRepository.findAll();
	}
	public Task saveTask(Task task)
	{
		return taskRepository.save(task);
	}
	public void deleteTask(int id)
	{
		taskRepository.deleteById(id);
	}
	
}