#!/user/bin/env python

import RPi.GPIO as GPIO
from mfrc522 import SimpleMFRC522

reader = SimpleMFRC522()

try:
    id, text = reader.read()
    print(id)
    print(text)
    with open('testRFID.txt','a') as f:
        f.write(text)
        f.write('\n')
finally:
    GPIO.cleanup()