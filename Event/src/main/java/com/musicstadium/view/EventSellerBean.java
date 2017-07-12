package com.musicstadium.view;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.musicstadium.model.EventSeller;
import com.musicstadium.service.EventSellerService;

@Named("eventsellerBean")
@RequestScoped

public class EventSellerBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EventSeller activeEventSeller = new EventSeller();
		
	
	public void setActiveProduct(EventSeller activeEventSeller) {
		this.activeEventSeller = activeEventSeller;
	}
	
	
	public EventSeller getActiveEventSeller() {
		return activeEventSeller;
	}
	
	@Inject
	private EventSellerService eventSellerService;
		
	EventSeller eventSeller = new EventSeller();
		
		
//	Adicionar productos
		
}
