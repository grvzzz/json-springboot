package com.opus.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	String id;
	String File;
	int line;
	String word; 
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(String file, int line, String word) {
		super();
		
		File = file;
		this.line = line;
		this.word = word;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFile() {
		return File;
	}

	public void setFile(String file) {
		File = file;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", File=" + File + ", line=" + line + ", word=" + word + "]";
	}
	
	
}
