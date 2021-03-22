package com.dev.delta.managem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.managem.entities.Clientt;
import com.dev.delta.managem.entities.Message;
import com.dev.delta.managem.entities.MyTask;
import com.dev.delta.managem.entities.Note;
import com.dev.delta.managem.entities.Project;
import com.dev.delta.managem.entities.Task;
import com.dev.delta.managem.services.ClientManagemService;
import com.dev.delta.managem.services.MessageService;
import com.dev.delta.managem.services.MyTaskService;
import com.dev.delta.managem.services.NoteService;
import com.dev.delta.managem.services.ProjectService;
import com.dev.delta.managem.services.TaskService;
@Service
public class Managem implements IManagem {

	@Autowired
	ClientManagemService clientManagemService;
	
	@Autowired
	MessageService messageService;
	
	@Autowired
	MyTaskService myTaskService;
	
	@Autowired
	NoteService noteService;
	
	@Autowired
	ProjectService projectService;
	
	@Autowired
	TaskService taskService;
	
	
	
	
	@Override
	public void initClients() {
		// TODO Auto-generated method stub
		clientManagemService.saveOrUpdate(new Clientt("", "", "", "", "", ""));
	}

	@Override
	public void initMessage() {
		// TODO Auto-generated method stub
		messageService.saveOrUpdate(new Message("", "", "", "", "", ""));
	}

	@Override
	public void initMyTasks() {
		// TODO Auto-generated method stub
		myTaskService.saveOrUpdate(new MyTask("", ""));
	}

	@Override
	public void initNotes() {
		// TODO Auto-generated method stub
		noteService.saveOrUpdate(new Note(""));
	}

	@Override
	public void initProjects() {
		// TODO Auto-generated method stub
		projectService.saveOrUpdate(new Project("", "", "", "", "", ""));
	}

	@Override
	public void initTasks() {
		// TODO Auto-generated method stub
		taskService.saveOrUpdate(new Task("", "", "", "", "", "", ""));
	}

	@Override
	public void populate() {
		initClients();
		initMessage();
		initMyTasks();
		initNotes();
		initProjects();
		initTasks();
		
	}

}
