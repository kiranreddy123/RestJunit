package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class CoronaControllerTest {

	@Autowired
	private CoronaService cService;
	@Mock
	private CoronaController cController;

	@Test
	public void TestAllCoronas() {
		// List<Corona> cLis = cService.getAllCoronaDetails();
		// ResponseEntity<List<Corona>> li = (ResponseEntity<List<Corona>>)
		// cService.getAllCoronaDetails();
		Corona c = new Corona(1L, 90233, "Guptha", "5098", "20394");
		Corona c1 = new Corona(2L, 9023, "chepta", "5028", "2034");
		Corona c2 = new Corona(3L, 9033, "kuptha", "598", "2094");
		List<Corona> list = new ArrayList<Corona>();
		list.add(c);
		list.add(c1);
		list.add(c2);
		ResponseEntity<List<Corona>> resp = cController.getAllCoronas();
		assertEquals(resp.getStatusCode(), HttpStatus.OK);
	}
}