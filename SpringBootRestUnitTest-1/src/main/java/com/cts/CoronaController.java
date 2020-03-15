package com.cts;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/corona")
public class CoronaController {

	@Autowired
	private CoronaService cService;

	@GetMapping("/getCoronas")
	public ResponseEntity<List<Corona>> getAllCoronas() {
		List<Corona> cList = cService.getAllCoronaDetails();
		return new ResponseEntity<List<Corona>>(cList, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/spreadCorona")
	public ResponseEntity<Corona> addAllCoronas( Corona corona) {
		Corona co = cService.spreadCorona(corona);
		return new ResponseEntity<Corona>(co, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/deleteCountry/{Country_id}")
	public HttpStatus deleteCorona(@PathParam("Country_id") Long Country_id) throws RecordNotFoundException {
		cService.deleteCoronaPatient(Country_id);
		return HttpStatus.FORBIDDEN;
	}

}
