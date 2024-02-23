create table store_ElectroEmployee (
	electro_employee_id LONG not null primary key,
	etype LONG
);

create table store_ElectroType (
	electro_type_id LONG not null primary key,
	name VARCHAR(75) null
);

create table store_Electronics (
	electronics_id LONG not null primary key,
	name VARCHAR(75) null,
	etype LONG,
	price LONG,
	count LONG,
	inStock BOOLEAN,
	archive BOOLEAN,
	description VARCHAR(75) null
);

create table store_Employee (
	employee_id LONG not null primary key,
	lastname VARCHAR(75) null,
	firstname VARCHAR(75) null,
	patronymic VARCHAR(75) null,
	birthdate DATE null,
	position LONG,
	gender BOOLEAN
);

create table store_PositionType (
	position_id LONG not null primary key,
	name VARCHAR(75) null
);

create table store_Purchase (
	purchase_id LONG not null primary key,
	electro_id LONG,
	employee_id LONG,
	purchaseDate DATE null,
	type_ LONG
);

create table store_PurchaseType (
	purchase_type_id LONG not null primary key,
	name VARCHAR(75) null
);