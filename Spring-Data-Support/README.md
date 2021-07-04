# Spring Data Support 

### Postgresql Installation
```
$ sudo apt-get update
 
$ sudo apt install postgresql postgresql-contrib
```

***Use Default User-psql***
```
$ sudo -u postgres psql postgres
```


***Use New User***
```
$ sudo -u postgres psql postgres

postgres=# CREATE ROLE "Shiru99" WITH PASSWORD '1234';

postgres=# ALTER ROLE  "Shiru99" WITH LOGIN;
```

***Create New Database***
```
postgres=# CREATE DATABASE dbname;  (dbname - all letters small)

$ psql -U Shiru99 -h localhost -p 5432 -d dbname;
```

***Create New Table***
```
dbname=> CREATE TABLE table_name(
   ID INT PRIMARY KEY     NOT NULL,
   NAME           TEXT    NOT NULL,
   AGE            INT     NOT NULL,
   ADDRESS        CHAR(50),
   SALARY         REAL
);
```
