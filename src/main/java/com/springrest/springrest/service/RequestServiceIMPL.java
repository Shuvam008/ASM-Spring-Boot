package com.springrest.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.RequestDao;
import com.springrest.springrest.entities.Request;
@Service
public class RequestServiceIMPL implements RequestService{
	
	@Autowired
	private RequestDao requestDao;
	
	
	@Override
	public List<Request> getServiceRequest() {
		return requestDao.findAll();
		
	}

	@Override
	public Request getServiceRequest(long requestID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Request addServiceRequest(Request request) {
		requestDao.save(request);
		return request;
	}

	@Override
	public Request UpdateServiceRequest(Request request) {
		requestDao.save(request);
		return request;
	}

	@Override
	public void deleteServiceRequest(long requestID) {
		Request entity = requestDao.getOne(requestID);
		requestDao.delete(entity);
		
	}

}
