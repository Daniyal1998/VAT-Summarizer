# Introduction---
# This pyhton script is just for running some other python scripts after copying files from source to destination.


import urllib.request
import urllib.error
import re
import sys
import time
import os
import pipes
import pydub
import glob
import shutil

if __name__ == '__main__':
	path = r'C:\Users\dell\video summariser\videoJava\*.mp4'
	destination = r'C:\Users\dell\video summariser\code\song.mp4'
	mp4_files = glob.glob(path)

	for mp4_file in mp4_files:
		shutil.copy(mp4_file,destination)

	try:
		os.system(r'python video_to_audio.py song.mp4')
	except OSError as err:
		print(err.reason)
		exit(1)

	mp4_files = glob.glob('./*.mp4')
	for mp4_file in mp4_files:
		os.remove(mp4_file)

	wav_files = glob.glob('./*.wav')
	destination = r'C:\Users\dell\video summariser\songJava\song.wav'

	for wav_file in wav_files:
		shutil.copy(wav_file,destination)
		os.remove(wav_file)