# Introduction---
# This Python script is used to convert the text to audio. This can be done by using the pyttsx3 library.
# The Feature is mainly for those who just want to know the summary without reading or going through it.
# So just lay down and listen!!!

import pyttsx3

if __name__ == '__main__':

	textFile = open(r'C:\Users\dell\video summariser\generated_text\generated_text.txt')
	text = textFile.read()
	textFile.close()
	
	engine = pyttsx3.init(driverName=None, debug=False)
	rate = engine.getProperty('rate')   # getting details of current speaking rate
	engine.setProperty('rate', 150)     # setting up new voice rate
	engine.say(text)
	engine.runAndWait()
	engine.stop()