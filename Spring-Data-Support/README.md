# Spring Data Support 

## Postgresql Basics

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
dbname=> CREATE TABLE circle(
   ID    INT   PRIMARY KEY    NOT NULL,
   NAME  CHAR(50)
);
```

***Insert New Table-entries***
```
dbname=> INSERT INTO circle VALUES (1, 'First Circle');
dbname=> INSERT INTO circle VALUES (2, 'वर्तुलम्');
```

***List of Tables***
```
dbname=> \dt;
```

***Table-entries***
```
dbname=> select * from circle;
```
---
