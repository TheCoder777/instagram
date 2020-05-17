from win10toast import ToastNotifier
import time

toast = ToastNotifier()
toast.show_toast(
    "New Email",
    "Hey, wanna meet up at 8 pm?",
    icon_path="email_icon.ico",
    duration=,)
