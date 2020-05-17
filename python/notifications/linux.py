from notify2 import Notification
import time

message = Notification(
    "Summary",
    message="Some body text",
    icon="email_icon.ico"
)

message.show()
time.sleep(5)
message.close()