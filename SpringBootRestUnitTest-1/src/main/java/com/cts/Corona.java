package com.cts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Corona {
	
	public Corona() {
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Country_id;
	public Long getCountry_id() {
		return Country_id;
	}
	public void setCountry_id(Long country_id) {
		Country_id = country_id;
	}
	private int affected_people;
	private String names;
	private String dead_ppl;
	private String cured_ppl;
	public int getAffected_people() {
		return affected_people;
	}
	public void setAffected_people(int affected_people) {
		this.affected_people = affected_people;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getDead_ppl() {
		return dead_ppl;
	}
	public void setDead_ppl(String dead_ppl) {
		this.dead_ppl = dead_ppl;
	}
	public String getCured_ppl() {
		return cured_ppl;
	}
	public void setCured_ppl(String cured_ppl) {
		this.cured_ppl = cured_ppl;
	}
	
	public Corona(Long country_id, int affected_people, String names, String dead_ppl, String cured_ppl) {
		super();
		Country_id = country_id;
		this.affected_people = affected_people;
		this.names = names;
		this.dead_ppl = dead_ppl;
		this.cured_ppl = cured_ppl;
	}
	@Override
	public String toString() {
		return "Corona [Country_id=" + Country_id + ", affected_people=" + affected_people + ", names=" + names
				+ ", dead_ppl=" + dead_ppl + ", cured_ppl=" + cured_ppl + "]";
	}
		
}
