# @thecoder777 || Python

""" Building a fully fleged website with Python/Flask as backend """
# 'pip install flask gevent' to install all used packages
from flask import Flask, render_template, request, redirect
from gevent.pywsgi import WSGIServer
from model import register_user, check_db
import sys

app = Flask(__name__)

@app.route("/")  # redirect from root '/' to '/register'
def index():
    return redirect("/register")

@app.route("/register")
def register():
    check_db()  # create db if not exists
    return render_template('register.html',
        action="register",
        status="",
        color="",
        message="Registering user...")

@app.route("/register", methods=["POST"])
def get_registration_data():
    if request.method == "POST":  # only if website sends sth
        email = request.form["email"]  # get userinput via HTML-form
        username = request.form["username"]
        if register_user(username, email):  # if sth is wrong with the db
            print("Failed to register!", file=sys.stderr)
            return render_template('register.html',
                action="register",
                status="Failed to register! Please try again!",
                status_color="#ff0033")
        else:  # db check successfull
            print("Successfully registered!", file=sys.stderr)
            return render_template('register.html',
                action="finish",
                status="You have been successfully registered!",
                status_color="#08da94",
                username=username)

if  __name__ == "__main__":
    check_db()
    # development/debugging (flask default):
    # app.run(host="0.0.0.0", port=8000, debug=True)

    # basic server ready for real-life usage
    server = WSGIServer(('0.0.0.0', 8000), app)
    server.serve_forever()
