# Introduction---
# This python script is to convert Video to audio(.wav file). To accomplish this we are using ffmpeg.
# FFmpeg is a free and open-source project consisting of a vast software suite of libraries and programs for handling video, audio
# and other multimedia files and streams.

import urllib.request
import urllib.error
import re
import sys
import time
import os
import pipes

def video_to_audio(fileName):
	try:
		# First we are fetching the file path and its extension.
		file, file_extension = os.path.splitext(fileName)
		# Gives us the shell-escaped version of the entered text.
		file = pipes.quote(file)
		# Writing a commmand to execute it in cmd
		video_to_wav = 'ffmpeg -i ' + file + file_extension + ' ' + file + '.wav'
		# Running the command.
		os.system(video_to_wav)
		
		print("sucessfully converted ", fileName, " into audio!")
	except OSError as err:
		print(err.reason)
		exit(1)

def main():
	if len(sys.argv) <1 or len(sys.argv) > 2:
		print('command usage: python3 video_to_audio.py FileName')
		exit(1)
	else:
		filePath = sys.argv[1]
		# check if the specified file exists or not
		try:
			if os.path.exists(filePath):
				print("file found!")
		except OSError as err:
			print(err.reason)
			exit(1)
		# convert video to audio
		video_to_audio(filePath)
		time.sleep(1)
		
# install ffmpeg and/or lame if you get an error saying that the program is currently not installed 
if __name__ == '__main__':
	main()
