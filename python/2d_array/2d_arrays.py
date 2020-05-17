#@thecoder777

""" Building a two-dimensional list / table """

# definition of height (rows), width (columns)
# and the content the 2D-list will consist of

rows = 2
columns = 3
content = 0  # 0 just for example

# building the table

table = [[content for c in range(columns)] \
		for r in range(rows)]

# printing the table in a readable format

for row in table:
    print(row)

"""
Output:

[0, 0, 0]
[0, 0, 0]

"""
