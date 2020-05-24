# @thecoder777 || Python

""" Building a fully fleged website with Python/Flask as backend """

from flask import Flask, render_template, request, redirect
from gevent.pywsgi import WSGIServer
from model import register_user, check_db
import sys

app = Flask(__name__)

@app.route("/")
def index():
    return redirect("/register")

@app.route("/register")
def home():
    check_db()
    return render_template('register.html',
        action="register",
        status="",
        color="",
        message="Registering user...")

@app.route("/register", methods=["POST"])
def get_registration_data():
    if request.method == "POST":
        email = request.form["email"]
        username = request.form["username"]
        if register_user(username, email):
            print("Failed to register!", file=sys.stderr)
            return render_template('register.html',
                action="register",
                status="Failed to register! Please try again!",
                status_color="#ff0033")
        else:
            print("Successfully registered!", file=sys.stderr)
            return render_template('register.html',
                action="finish",
                status="You have been successfully registered!",
                status_color="#08da94",
                username=username)

if  __name__ == "__main__":
    check_db()
    # development/debugging:
    # app.run(host="0.0.0.0", port=8000, debug=True)

    server = WSGIServer(('0.0.0.0', 8000), app)
    server.serve_forever()
