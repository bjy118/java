create table IF NOT EXISTS product(
p_id VARCHAR(10) NOT NULL,
p_name VARCHAR(10),
p_unitPRice INTEGER,
p_description TEXT,
p_category VARCHAR(20),
p_manufacturer VARCHAR(20),
p_unitsInStock LONG,
p_condition VARCHAR(20),
p_fileName VARCHAR(20),
PRIMARY KEY (p_id)
)default CHARSET=utf8;