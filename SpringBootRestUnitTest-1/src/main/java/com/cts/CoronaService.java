package com.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CoronaService {

	@Autowired
	private CoronaRepository coronaRepo;

	public List<Corona> getAllCoronaDetails() {
		List<Corona> corona = coronaRepo.findAll();
		if (corona.size() > 0) {
			return corona;
		} else
			return new ArrayList<Corona>();
	}

	public Corona spreadCorona( Corona corona) {
		return coronaRepo.save(corona);
	}

	/*
	 * public Corona updateCoronaPatients(@RequestParam Corona corona) throws
	 * RecordNotFoundException{ Optional<Corona>
	 * co=coronaRepo.findById(corona.getCountry_id()); if(co.isPresent()) { Corona
	 * newCo=co.get(); newCo.setAffected_people(co.getAffected_people());
	 * newCo.setCured_ppl(co.getCured_ppl()); newCo.setNames(co.getNames());
	 * newCo.setDead_ppl(co.getDead_ppl()); newCo=coronaRepo.save(newCo); return
	 * newCo; } else { corona=coronaRepo.save(corona); return corona; } }
	 */

	public void deleteCoronaPatient( Long Country_id) throws RecordNotFoundException {
		Optional<Corona> corona = coronaRepo.findById(Country_id);
		if (corona.isPresent()) {
			coronaRepo.deleteById(Country_id);
		} else {
			throw new RecordNotFoundException("No such a record found on this" + Country_id);
		}
	}
}
