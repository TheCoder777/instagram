# @thecoder777 || Python

""" Basic sqlite3 database operations in Python """

import sqlite3

db_path = "database.db"

# initialize database
connection = sqlite3.connect(db_path)
cursor = connection.cursor()
cursor.execute("CREATE TABLE if not exists people \
    (id INTEGER PRIMARY KEY, name TEXT, age INTEGER)")

# write data to database
cursor.execute("INSERT INTO people('name', 'age') \
    VALUES('Bob', 23)")
connection.commit()

# read data from database
cursor.execute("SELECT * FROM people WHERE id = 1")
row = cursor.fetchone()
print(row)  # (1, 'Bob', 23)

# delete data from database
cursor.execute("DELETE FROM people WHERE id = 1")
connection.commit()
