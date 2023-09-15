package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.Passenger;
import com.nt.binding.TicketINfo;

@RestController
public class TicketRestController {
	@PostMapping(value="/ticket",
			produces={"application/json"},
			consumes={"application/json"})
	public ResponseEntity<TicketINfo>bookTicket(@RequestBody Passenger request){
		System.out.println(request);
		
		TicketINfo tinfo=new TicketINfo();
		tinfo.setTicketId(101);
		tinfo.setPnr("ijnk4554");
		tinfo.setTicketStatus("WL");
		
		return new ResponseEntity<>(tinfo,HttpStatus.CREATED);
	}

}








