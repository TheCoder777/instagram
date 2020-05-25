# @thecoder777 || Python

""" Database managment goes here """

import sqlite3
import sys

db_path = "userdata.db"

# check if there are any problems with the database
def check_db():
    try:
        conn = sqlite3.connect(db_path)
        cur = conn.cursor()
        cur.execute("CREATE TABLE if not exists users \
        (id INTEGER PRIMARY KEY, email TEXT, name TEXT)")
        return 0
    except FileNotFoundError as e:
        print(f"User database not found! \n ERROR:\n{e}", file=sys.stderr)
        return 1  # return 1 if sth goes wrong

# save email & username
def register_user(email, username):
    if check_db():
        return 1  # error code 1
    else:
        conn = sqlite3.connect(db_path)
        cur = conn.cursor()
        cur.execute("INSERT INTO users('email', 'name') \
        VALUES(?, ?)", (email, username))
        conn.commit()
