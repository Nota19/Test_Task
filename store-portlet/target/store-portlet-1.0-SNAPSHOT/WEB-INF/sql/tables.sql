create table store_ElectroEmployee (
	uuid_ VARCHAR(75) null,
	electro_employee_id LONG not null primary key,
	etype LONG
);

create table store_ElectroType (
	uuid_ VARCHAR(75) null,
	electro_type_id LONG not null primary key,
	name VARCHAR(75) null
);

create table store_Electronics (
	uuid_ VARCHAR(75) null,
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
	uuid_ VARCHAR(75) null,
	employee_id LONG not null primary key,
	lastname VARCHAR(75) null,
	firstname VARCHAR(75) null,
	patronymic VARCHAR(75) null,
	birthdate DATE null,
	position LONG,
	gender BOOLEAN
);

create table store_PositionType (
	uuid_ VARCHAR(75) null,
	position_id LONG not null primary key,
	name VARCHAR(75) null
);

create table store_Purchase (
	uuid_ VARCHAR(75) null,
	purchase_id LONG not null primary key,
	electro_id LONG,
	employee_id LONG,
	purchaseDate DATE null,
	type_ LONG
);

create table store_PurchaseType (
	uuid_ VARCHAR(75) null,
	purchase_type_id LONG not null primary key,
	name VARCHAR(75) null
);