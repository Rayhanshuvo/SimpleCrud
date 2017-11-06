package com.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {
	@Autowired
	private CrudRepository crudRepository;
	
	public void save(Crud crud){
		crudRepository.save(crud);
	}
	
	public List<Crud> list(){
		return crudRepository.findAll();
		
	}
	
	public void delete(int id){
		crudRepository.delete(id);
	}
	
	public Crud edit(int id){
		
		return crudRepository.getOne(id);
		
	}

}
