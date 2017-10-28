-- creating user xyz with DBA role

CREATE USER xyz IDENTITY BY 'password';

GRANT CONNECT, RESOURCE, DBA TO xyz;