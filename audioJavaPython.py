# Introduction---
# This python script is used to convert the audio to text but not using speech_recognition.
# The conversion is done with the help of selenium and Web Speech API demonstrator.
# The audio is passed directly after being played using with the help of Virtual Audio Cable.
# Audio is played using python pyaudio library. After fetching the desired text from the span tags store it in .txt file.


import time
from selenium import webdriver
from selenium.webdriver.chrome.options import Options
import glob
import pydub
import os
import pyaudio
import wave

if __name__ == '__main__':

	# Give the dirctory path for the audio to be converted.
	mp3_files = glob.glob(r'C:\Users\dell\video summariser\songJava\*.mp3')
	# Accessing the mp3 file from the desired location and converting into .wav format.
	for mp3_file in mp3_files:
		wav_file = os.path.splitext(mp3_file)[0] + '.wav'
		sound = pydub.AudioSegment.from_mp3(mp3_file)
		sound.export(wav_file, format="wav")
		os.remove(mp3_file)
	# These options is used to block any kind of pop-ups while opening the broweser using selenium.
	option = Options()

	option.add_argument("--disable-infobars")
	option.add_argument("start-maximized")
	option.add_argument("--disable-extensions")

	# Pass the argument 1 to allow and 2 to block
	option.add_experimental_option("prefs", { 
    	"profile.default_content_setting_values.media_stream_mic": 1 
	})
	# In order to use Chrome as a browser for the selenium we have to use chromedriver. Put the path where this chrome driver is located.
	driver = webdriver.Chrome(options = option, executable_path = r"C:\chromedriver\chromedriver.exe")
	# Give the address of the web page you want to operate on.
	driver.get('https://www.google.com/intl/en/chrome/demos/speech.html?authuser=2')

	# To select any kind of dropdowns.
	dropdown = driver.find_element_by_id("select_dialect")
	for option in dropdown.find_elements_by_tag_name('option'):
		if option.text == 'India':
			option.click() # select() in earlier versions of webdriver
			break

	# Finding buttons and then clicking it to start recording.
	button = driver.find_element_by_id("start_button")
	button.click()

	# Next code is for opening the audio file and thereby giving the input to the recorder.
	filename = r'C:\Users\dell\video summariser\songJava\song.wav'

	# Set chunk size of 1024 samples per data frame
	chunk = 1024  

	# Open the sound file 
	wf = wave.open(filename, 'rb')

	# Create an interface to PortAudio
	p = pyaudio.PyAudio()

	# Open a .Stream object to write the WAV file to
	# 'output = True' indicates that the sound will be played rather than recorded
	stream = p.open(format = p.get_format_from_width(wf.getsampwidth()),
	                channels = wf.getnchannels(),
	                rate = wf.getframerate(),
	                output = True)

	# Read data in chunks
	data = wf.readframes(chunk)

	# Play the sound by writing the audio data to the stream
	while data != '':
	    stream.write(data)
	    data = wf.readframes(chunk)
    
	    if data == b'':
	        break

	# Close and terminate the stream
	wf.close()
	stream.close()
	p.terminate()

	button = driver.find_element_by_id("start_button")
	button.click()

	time.sleep(1)

	span1 = driver.find_element_by_id("final_span")
	span2 = driver.find_element_by_id("interim_span")
	converted_text = span1.text + span2.text
	#print(converted_text)

	driver.close()

	# Storing the extracted string into a .txt file.
	text_file = open(r'C:\Users\dell\video summariser\generated_text\generated_text.txt','w+')
	text_file.write(converted_text)
	text_file.close()