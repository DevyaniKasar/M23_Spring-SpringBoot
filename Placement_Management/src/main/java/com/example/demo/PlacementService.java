package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PlacementService 
{
	@Autowired
	private PlacementRepository repo;
	
	//To retrieve all the data of student class
	public List<Placement>listAll() //(user defined method)
	{
		return repo.findAll();
	}
	//insert/create/update a data
	public void create(Placement p)
	{
		repo.save(p);
	}
	
	//To retrieve a single record
	public Placement retrieve(Integer id)
	{
		return repo.findById(id).get();
		
	}
	//To Delete a data
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}


}
