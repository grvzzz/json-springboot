package com.opus.demo.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opus.demo.emprepo.EmpRepo;
import com.opus.demo.model.Employee;




@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpRepo emprepo;
	
	@Override
	public void insertData()
	{
		
		emprepo.deleteAll();
		
		File dir = new File("files");

		for (File file : dir.listFiles())
		{
			try {
				StringBuilder sb = new StringBuilder();
			    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			    String line = null;
			    int cnt=0;
			    while( (line = br.readLine())!= null ){
			    	
			    	 cnt++;
			    	 emprepo.save(new Employee(file.getName(),cnt,line));
			       
			    }
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		
		
	}
	
	public List<Employee> getAll()
	{
		return emprepo.findAll();
	}
	
	
	
}
