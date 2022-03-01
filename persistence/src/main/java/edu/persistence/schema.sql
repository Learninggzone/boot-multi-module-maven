DROP TABLE IF EXISTS hotel;
CREATE TABLE hotel(
      id INT AUTO_INCREMENT PRIMARY KEY,
      name VARCHAR(30) NOT NULL,
      classification INT NOT NULL,
      is_open BOOLEAN NOT NULL
);
