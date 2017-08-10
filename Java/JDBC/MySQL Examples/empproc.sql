-- SQL File --> SuRu

delimiter //
create procedure empproc(in name char(12),in fathername char(12),in password char(12))
begin
insert into emp values(name,fathername,password);
end;
 //