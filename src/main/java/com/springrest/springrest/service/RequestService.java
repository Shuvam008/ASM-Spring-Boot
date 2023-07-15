package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Request;

public interface RequestService {
	public List<Request> getServiceRequest();
	public Request getServiceRequest(long requestID);
	public Request addServiceRequest(Request request);
	public Request UpdateServiceRequest(Request request);
	public void deleteServiceRequest(long requestID);
}
