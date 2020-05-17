""" Sending desktop notifications in Linux ..."""

# install with 'pip install notify2'
import notify2, time, os

# initialize notify2 with the name 'Email'
notify2.init("Email")

# create notification
message = notify2.Notification(
    "New email",
    "Hey, wanna meet up at 8 pm?",
    icon=os.getcwd() + "/email_icon.ico")

# set urgency (LOW, NORMAL, CRITICAL) (optional)
message.set_urgency(notify2.URGENCY_CRITICAL)

# send the notification
message.show()
