from datetime import datetime


def not_by_night(func):
    def wrapper():
        if 8 <= datetime.now().hour < 22:
            func()
        else:
            pass  # It's night
    return wrapper


def say_hello():
    print("Hello World!")

say_hello = not_by_night(say_hello)

say_hello()
