package com.cg.DI_Collection;

import java.util.*;

public class JavaCollection 
{  
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	//a setter method to set list
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	
	//prints and returns all the elements of the list
	public List getAddressList() 
	{
		System.out.println("List Elements:" + addressList);
		return addressList;
	}
	
	//a setter method to set set
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	
	//prints and returns all the elements of the set
	public Set getAddressSet() 
	{
		System.out.println("Set Elements:" + addressSet);
		return addressSet;
	}
	
	//a setter method to set map
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	
	//prints and returns all the elements of the map
	public Map getAddressMap() 
	{
		System.out.println("Map Elements:" + addressMap);
		return addressMap;
	}
	
	//a setter method to set property
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	
	//prints and returns all the elements of the property
	public Properties getAddressProp() 
	{
		System.out.println("Property Elements:" + addressProp);
		return addressProp;
	}
	
	
	
	

}
