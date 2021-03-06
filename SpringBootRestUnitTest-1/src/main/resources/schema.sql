DROP TABLE IF EXISTS CORONA;
  
CREATE TABLE CORONA (
  country_id INT AUTO_INCREMENT  PRIMARY KEY,
  affected_people INT(250) NOT NULL,
  names VARCHAR(250) NOT NULL,
  dead_ppl VARCHAR(250) DEFAULT NULL,
  cured_ppl VARCHAR(250) DEFAULT NULL
);