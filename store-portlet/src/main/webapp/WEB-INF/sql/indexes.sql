create index IX_AFB309AD on store_ElectroEmployee (etype);

create index IX_487E06B0 on store_Electronics (etype);

create index IX_D9DB408F on store_Employee (position);

create index IX_E95DD867 on store_Purchase (electro_id);
create index IX_30FE8AD7 on store_Purchase (employee_id);
create index IX_48FDD370 on store_Purchase (type_);