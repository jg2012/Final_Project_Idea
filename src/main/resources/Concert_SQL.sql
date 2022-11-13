DROP TABLE IF EXISTS Attendee_has_Concert;
DROP TABLE IF EXISTS Attendee_has_Venue;
DROP TABLE IF EXISTS Venue;
DROP TABLE IF EXISTS Concert;
DROP TABLE IF EXISTS Attendee;


CREATE TABLE IF NOT EXISTS `Concerts`.`Attendee` (
  `attendee_pk` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `attendee_first_name` VARCHAR(45) NOT NULL,
  `attendee_last_name` VARCHAR(45) NOT NULL,
  `attendee_city` VARCHAR(45) NOT NULL,
  `attendee_state` VARCHAR(45) NOT NULL,
  `concert_attendance` VARCHAR(45),
  PRIMARY KEY (`attendee_pk`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `Concerts`.`Concert` (
  `concert_pk` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `musical_artist` VARCHAR(45) NOT NULL,
  `concert_date` VARCHAR(45) NOT NULL,
  `concert_venue` VARCHAR(45) NOT NULL,
  `concert_city` VARCHAR(45) NOT NULL,
  `concert_state` VARCHAR(45) NOT NULL,
  `concert_attendee` VARCHAR(45),
  PRIMARY KEY (`concert_pk`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `Concerts`.`Venue` (
  `venue_pk` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `venue_name` VARCHAR(50) NOT NULL,
  `venue_city` VARCHAR(45) NOT NULL,
  `venue_state` VARCHAR(45) NOT NULL,
  `Concert_concert_pk` INT UNSIGNED ,
  PRIMARY KEY (`venue_pk`),
  INDEX `fk_Venue_Concert_idx` (`Concert_concert_pk` ASC) VISIBLE,
  CONSTRAINT `fk_Venue_Concert`
    FOREIGN KEY (`Concert_concert_pk`)
    REFERENCES `Concerts`.`Concert` (`concert_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `Concerts`.`Attendee_has_Concert` (
  `Attendee_attendee_pk` INT UNSIGNED NOT NULL,
  `Concert_concert_pk` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`Attendee_attendee_pk`, `Concert_concert_pk`),
  INDEX `fk_Attendee_has_Concert_Concert1_idx` (`Concert_concert_pk` ASC) VISIBLE,
  INDEX `fk_Attendee_has_Concert_Attendee1_idx` (`Attendee_attendee_pk` ASC) VISIBLE,
  CONSTRAINT `fk_Attendee_has_Concert_Attendee1`
    FOREIGN KEY (`Attendee_attendee_pk`)
    REFERENCES `Concerts`.`Attendee` (`attendee_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Attendee_has_Concert_Concert1`
    FOREIGN KEY (`Concert_concert_pk`)
    REFERENCES `Concerts`.`Concert` (`concert_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `Concerts`.`Attendee_has_Venue` (
  `Attendee_attendee_pk` INT UNSIGNED NOT NULL,
  `Venue_venue_pk` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`Attendee_attendee_pk`, `Venue_venue_pk`),
  INDEX `fk_Attendee_has_Venue_Venue1_idx` (`Venue_venue_pk` ASC) VISIBLE,
  INDEX `fk_Attendee_has_Venue_Attendee1_idx` (`Attendee_attendee_pk` ASC) VISIBLE,
  CONSTRAINT `fk_Attendee_has_Venue_Attendee1`
    FOREIGN KEY (`Attendee_attendee_pk`)
    REFERENCES `Concerts`.`Attendee` (`attendee_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Attendee_has_Venue_Venue1`
    FOREIGN KEY (`Venue_venue_pk`)
    REFERENCES `Concerts`.`Venue` (`venue_pk`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


