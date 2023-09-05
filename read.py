#!/user/bin/env python

import RPi.GPIO as GPIO
import time
from mfrc522 import SimpleMFRC522

reader = SimpleMFRC522()

i = 1

while i == 1:
    try:
        id, text = reader.read()
        print(id)
        print(text)
        with open('testRFID.txt','a') as f:
            f.write(text)
            f.write('\n')
    finally:
        time.sleep(2)

GPIO.cleanup()