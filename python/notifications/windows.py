"""... and Windows """

# install with 'pip install win10toast'
from win10toast import ToastNotifier

# create a class instance 'toast'
toast = ToastNotifier()

# create and send the notification
toast.show_toast(
    "New email",
    "Hey, wanna meet up at 8 pm?",
    icon_path="email_icon.ico",
    duration=10)
