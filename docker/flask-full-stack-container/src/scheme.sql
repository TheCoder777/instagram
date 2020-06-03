-- @thecoder777 || SQL 'scheme.sql'

/* If anyone needs it, here is the sql file for the db */

create table if not exists posts (
    id integer primary key autoincrement,
    email text,
    name text
);
