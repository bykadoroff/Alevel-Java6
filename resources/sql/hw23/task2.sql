CREATE TABLE Customer (
  login VARCHAR(50) NOT NULL,
  firstName VARCHAR(50) NOT NULL,
  lastName VARCHAR(50) NOT NULL,
  dateOfBirth DATE NOT NULL,
  country VARCHAR(50) NOT NULL,
  sex ENUM('male', 'female') NOT NULL,
  PRIMARY KEY (login)
)
