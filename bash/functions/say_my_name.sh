#!/usr/bin/env bash
# @thecoder777 || Bash

say_my_name() {
    echo "Hello, $1!"
}

# same as above, just an alternative syntax
function say_my_name() {
    echo "Hello, $1!"
}

if [[ -z $1 ]]; then
    say_my_name "Bob"
else
    say_my_name $1
fi

# './say_my_name.sh' outputs:
# "Hello, Bob!"

# './say_my_name.sh John' outputs:
# "Hello, John!"
