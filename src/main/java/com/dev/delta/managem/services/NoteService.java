package com.dev.delta.managem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.managem.dao.NoteRepository;
import com.dev.delta.managem.entities.Note;

@Service
public class NoteService {
	@Autowired
	NoteRepository  noteRepository;
	
	public Note saveOrUpdate(Note note)
	{
		
		return noteRepository.save(note);
	}
	
	public Iterable<Note> findAll()
	{
		return noteRepository.findAll();
	}
	
	public Note findById(Long id)
	{
		return noteRepository.getOne(id);
	}
	
	public void delete(Long id)
	{
		Note note=findById(id);
		noteRepository.delete(note);
	}
}
