package com.dev.delta.librarylab.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="librarylab_book")
public class Book {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String isbn;
	String  title;
	String  subtitle;
	String  author;
	String  edition;
	String  edition_year;
	String   number_of_books;
	String  photo;
	String  physical_form;
	String  publisher;
	String  series;
	String  size;
	String  price;
	String  call_no;
	String  location;
	String  clue_page;
     String  editor;
     String  publishing_year;
     String  publication_place;
     String  number_of_pages;
     String  source_details;
     String notes;
     String  pdf;
     String  link;
     
     public Book() {
		// TODO Auto-generated constructor stub
	}

     
	public Book(String isbn, String title, String subtitle, String author, String edition, String edition_year,
			String number_of_books, String photo, String physical_form, String publisher, String series, String size,
			String price, String call_no, String location, String clue_page, String editor, String publishing_year,
			String publication_place, String number_of_pages, String source_details, String notes, String pdf,
			String link) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.subtitle = subtitle;
		this.author = author;
		this.edition = edition;
		this.edition_year = edition_year;
		this.number_of_books = number_of_books;
		this.photo = photo;
		this.physical_form = physical_form;
		this.publisher = publisher;
		this.series = series;
		this.size = size;
		this.price = price;
		this.call_no = call_no;
		this.location = location;
		this.clue_page = clue_page;
		this.editor = editor;
		this.publishing_year = publishing_year;
		this.publication_place = publication_place;
		this.number_of_pages = number_of_pages;
		this.source_details = source_details;
		this.notes = notes;
		this.pdf = pdf;
		this.link = link;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getEdition_year() {
		return edition_year;
	}

	public void setEdition_year(String edition_year) {
		this.edition_year = edition_year;
	}

	public String getNumber_of_books() {
		return number_of_books;
	}

	public void setNumber_of_books(String number_of_books) {
		this.number_of_books = number_of_books;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhysical_form() {
		return physical_form;
	}

	public void setPhysical_form(String physical_form) {
		this.physical_form = physical_form;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCall_no() {
		return call_no;
	}

	public void setCall_no(String call_no) {
		this.call_no = call_no;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getClue_page() {
		return clue_page;
	}

	public void setClue_page(String clue_page) {
		this.clue_page = clue_page;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getPublishing_year() {
		return publishing_year;
	}

	public void setPublishing_year(String publishing_year) {
		this.publishing_year = publishing_year;
	}

	public String getPublication_place() {
		return publication_place;
	}

	public void setPublication_place(String publication_place) {
		this.publication_place = publication_place;
	}

	public String getNumber_of_pages() {
		return number_of_pages;
	}

	public void setNumber_of_pages(String number_of_pages) {
		this.number_of_pages = number_of_pages;
	}

	public String getSource_details() {
		return source_details;
	}

	public void setSource_details(String source_details) {
		this.source_details = source_details;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getPdf() {
		return pdf;
	}

	public void setPdf(String pdf) {
		this.pdf = pdf;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
     
     
}
