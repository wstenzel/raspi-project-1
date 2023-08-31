#!/usr/bin/env python

import RPi.GPIO as GPIO
from mfrc522 import SimpleMFRC522

reader = SimpleMFRC522()

try:
    text = input('Enter Student ID#: ')
    print("Place tag to write...")
    reader.write(text)
    print("Write complete.")
finally:
    GPIO.cleanup()