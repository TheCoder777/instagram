# @thecoder777 || Python

""" Commandline arguments in Python """

import sys

""" 'sys.argv' is a list with all the
arguments the user provided, starting
from 0 (sys.argv[0]).

The first argument 'sys.argv[0]' is the
command you used to run the script from
your terminal if you used the following
syntax: 'python <filename> <arguments>'
"""

# to print out all given arguments
# exept the first one use:

print(sys.argv[1:])


""" Example usage """

for arg in sys.argv:
    if arg == "--help":
        print("Help page")

#> python cmd_args.py --help

# Output:

"""
['--help']
Help page

"""
