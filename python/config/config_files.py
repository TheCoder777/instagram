# @thecoder777 || Python

""" Create config files with Python ..."""

import configparser

# create config handler
config = configparser.ConfigParser()

# some random data for the config file
userData = {"user": "Bob",
            "port": "22552",
            "server": "xyz.server.com"}

serverData = {"users": 4,
            "name": "xyzServer"}

# write userData and serverData to
# config sections 'User' and 'Server'
config["User"] = userData
config["Server"] = serverData

# write config to file
with open("config.ini", "w") as configfile:
    config.write(configfile)


# @thecoder777 || Python

"""... and read them """

import configparser
config = configparser.ConfigParser()

# read it
config.read("config.ini")

# print config file / loop through
for c in config.sections():
    print(c)
    for k,v in config[c].items():
        print("\t" + k + "\t" + v)
        # do somethig with it

""" Output:

User
	user	Bob
	port	22552
	server	xyz.server.com
Server
	users	4
	name	xyzServer
"""

# @thecoder777 || Python

""" The written config file:

#> cat config.ini

[User]
user = Bob
port = 22552
server = xyz.server.com

[Server]
users = 4
name = xyzServer
"""
