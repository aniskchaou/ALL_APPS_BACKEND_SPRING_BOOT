package com.dev.delta.librarylab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.librarylab.entities.Book;
import com.dev.delta.librarylab.entities.Category;
import com.dev.delta.librarylab.entities.Member;
import com.dev.delta.librarylab.entities.TypeMember;
import com.dev.delta.librarylab.services.BookService;
import com.dev.delta.librarylab.services.CategoryBookService;
import com.dev.delta.librarylab.services.MemberService;
import com.dev.delta.librarylab.services.TypeMemberService;

@Service
public class LibraryLab implements ILibraryLab {

	@Autowired
	BookService bookService;
	
	@Autowired
	CategoryBookService categoryBookService;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	TypeMemberService typeMemberService;
	
	@Override
	public void initBooks() {
		// TODO Auto-generated method stub
		bookService.saveOrUpdate(new Book("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
	}

	@Override
	public void initCategories() {
		// TODO Auto-generated method stub
		categoryBookService.saveOrUpdate(new Category("") );
	}

	@Override
	public void initMembers() {
		// TODO Auto-generated method stub
		memberService.saveOrUpdate(new Member("", "", "", "", "", "", "", ""));
	}

	@Override
	public void initTypeMembers() {
		typeMemberService.saveOrUpdate(new TypeMember(""));
		
	}

	@Override
	public void populate() {
		initBooks();
		initCategories();
		initMembers();
		initTypeMembers();
		
	}

}
