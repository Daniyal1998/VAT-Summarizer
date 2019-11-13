# VAT-Summarizer

# What is VAT-Summarizer?

VAT summarizer is basically a video, audio and text summarizer. The main idea behind this summarizer is to provide the user with 
a condensed version of the same. The output will either be a text or an audio which will help the user to know in shorts what was basically
conveyed through the article. The summarization technique which is used here is extractive type. The UI made in Java provides the user to 
operate this software with ease.

# Features

-> UI for convenient usage.

-> Summarize any kind of video, audio or text.

-> Summarization can be done using various algos. like TextRank, LexRank, Luhn or LSA.

-> Does Speech Recognition to get the text out of video.

-> Can even extract text from images using OCR.

-> Output can be in audio format which help people who face difficulty in reading.

# Steps involved and Approach

1. Conversion of Video to Audio: The video is converted to audio using python and FFmpeg (this is software that provides various tools to 
work on video and audio). The output of this will be an audio file in the form of .wav which can be converted to .mp3 if you wish.

2. Conversion of Audio to Text: The extracted audio is then converted to text using Google's web speech API and the automation is done
in python using selenium.

3. Summarization: The summarization is done using Sumy and is stored in a .txt file. Sumy provides various algos. like TextRank, LexRank
and Luhn algorithm etc.

4. Conversion of Text to Audio: The text is converted to audio using python library and the UI contains a play button for the same.

5. UI: User interface is made using java swing and it contains 3 frames. The first frame is for the introduction and the next frame is for
the file format input and the last frame is for the output to be displayed.
