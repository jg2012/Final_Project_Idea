-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


-- -----------------------------------------------------
-- Schema Concerts
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Concerts` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `Concerts` ;

-- -----------------------------------------------------
-- Table `Concerts`.`concert`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Concerts`.`concert` (
                                                    `concert_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
                                                    `concert_date` DATE NOT NULL,
                                                    `concert_musical_artist` VARCHAR(45) NOT NULL,
                                                    `concert_venue_name` VARCHAR(45) NOT NULL,
                                                    `concert_city` VARCHAR(40) NOT NULL,
                                                    `concert_state` VARCHAR(40) NOT NULL,
                                                    PRIMARY KEY (`concert_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Concerts`.`concert_attendee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Concerts`.`concert_attendee` (
                                                             `concert_attendee_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
                                                             `concert_attendee_first_name` VARCHAR(45) NOT NULL,
                                                             `concert_attendee_last_name` VARCHAR(45) NOT NULL,
                                                             `concert_musical_artist` VARCHAR(45) NOT NULL,
                                                             `concert_venue_name` VARCHAR(45) NOT NULL,
                                                             `concert_city` VARCHAR(40) NOT NULL,
                                                             `concert_state` VARCHAR(40) NOT NULL,
                                                             `concert_date` DATE NOT NULL,
                                                             PRIMARY KEY (`concert_attendee_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Concerts`.`concert_attendance`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Concerts`.`concert_attendance` (
                                                               `concert_attendance_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
                                                               `concert_attendance_fk` INT UNSIGNED NOT NULL,
                                                               `concerts_fk` INT UNSIGNED NOT NULL,
                                                               PRIMARY KEY (`concert_attendance_id`),
                                                               INDEX `concert_fk_idx` (`concerts_fk` ASC) VISIBLE,
                                                               INDEX `concert_attendance_fk_idx` (`concert_attendance_fk` ASC) VISIBLE,
                                                               CONSTRAINT `concert_attendance_fk`
                                                                   FOREIGN KEY (`concert_attendance_fk`)
                                                                       REFERENCES `Concerts`.`concert_attendee` (`concert_attendee_id`)
                                                                       ON DELETE CASCADE
                                                                       ON UPDATE CASCADE,
                                                               CONSTRAINT `concerts_fk`
                                                                   FOREIGN KEY (`concerts_fk`)
                                                                       REFERENCES `Concerts`.`concert` (`concert_id`)
                                                                       ON DELETE CASCADE
                                                                       ON UPDATE CASCADE)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Concerts`.`concert_venue`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Concerts`.`concert_venue` (
                                                          `concert_venue_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
                                                          `concert_venue_name` VARCHAR(50) NOT NULL,
                                                          `concert_venue_city` VARCHAR(45) NOT NULL,
                                                          `concert_venue_state` VARCHAR(45) NOT NULL,
                                                          PRIMARY KEY (`concert_venue_id`))
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `Concerts`.`concert_event`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Concerts`.`concert_event` (
                                                          `concert_event_id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
                                                          `concert_venue_fk` INT UNSIGNED NOT NULL,
                                                          `concert_fk` INT UNSIGNED NOT NULL,
                                                          `concert_attendee_fk` INT UNSIGNED NOT NULL,
                                                          PRIMARY KEY (`concert_event_id`),
                                                          INDEX `concert_venue_fk_idx` (`concert_venue_fk` ASC) VISIBLE,
                                                          INDEX `concert_fk_idx` (`concert_fk` ASC) VISIBLE,
                                                          INDEX `concert_attendee_fk_idx` (`concert_attendee_fk` ASC) VISIBLE,
                                                          CONSTRAINT `concert_venue_fk`
                                                              FOREIGN KEY (`concert_venue_fk`)
                                                                  REFERENCES `Concerts`.`concert_venue` (`concert_venue_id`)
                                                                  ON DELETE CASCADE
                                                                  ON UPDATE CASCADE,
                                                          CONSTRAINT `concert_fk`
                                                              FOREIGN KEY (`concert_fk`)
                                                                  REFERENCES `Concerts`.`concert` (`concert_id`)
                                                                  ON DELETE CASCADE
                                                                  ON UPDATE CASCADE,
                                                          CONSTRAINT `concert_attendee_fk`
                                                              FOREIGN KEY (`concert_attendee_fk`)
                                                                  REFERENCES `Concerts`.`concert_attendee` (`concert_attendee_id`)
                                                                  ON DELETE CASCADE
                                                                  ON UPDATE CASCADE)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
