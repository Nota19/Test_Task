create index IX_AFB309AD on store_ElectroEmployee (etype);
create index IX_FEE49352 on store_ElectroEmployee (uuid_);

create index IX_D142146 on store_ElectroType (uuid_);

create index IX_487E06B0 on store_Electronics (etype);
create index IX_97AF9055 on store_Electronics (uuid_);

create index IX_D9DB408F on store_Employee (position);
create index IX_49A24442 on store_Employee (uuid_);

create index IX_F1DE298D on store_PositionType (uuid_);

create index IX_E95DD867 on store_Purchase (electro_id);
create index IX_30FE8AD7 on store_Purchase (employee_id);
create index IX_48FDD370 on store_Purchase (type_);
create index IX_76AD934F on store_Purchase (uuid_);

create index IX_98AFBCB5 on store_PurchaseType (uuid_);