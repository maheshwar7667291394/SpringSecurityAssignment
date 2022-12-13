package com.masai.service;

import java.util.List;

import com.masai.exception.EventException;
import com.masai.model.Event;

public interface EventService {
	public Event AddEvent(Event event)throws EventException;
	public Event UpdateEvent(Event event,Integer id) throws EventException;
	public String DeleteEvent(Integer id)throws EventException;
	

}
