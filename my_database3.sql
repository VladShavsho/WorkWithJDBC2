USE Test;
CREATE TABLE IF NOT EXISTS employees (
	id INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    position VARCHAR(100),
    salary FLOAT
);
SELECT * FROM employees;
