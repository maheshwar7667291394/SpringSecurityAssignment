package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EventException;
import com.masai.model.Event;
import com.masai.repo.EventDao;

@Service
public class EventServiceImple implements EventService{
	@Autowired
	public EventDao edao;

	@Override
	public Event AddEvent(Event event) throws EventException {
		
	return 	edao.save(event);
		
		
	}

	@Override
	public Event UpdateEvent(Event event,Integer id) throws EventException {
		
		Optional<Event> events=edao.findById(id);
		if(events.isEmpty()) {
			throw new EventException("Event not persernt by this Event");
		}
		  Event ev=events.get();
		  return edao.save(event);
	}

	@Override
	public String DeleteEvent(Integer id) throws EventException {
		
		
		Optional<Event> evnts=edao.findById(id);
		if(evnts.isEmpty()) {
			throw new EventException("Event is not resent by this id");
		}
		
		edao.deleteById(id);
		return "event delation sussesfull";
		
	}

	
		
	
	


}
