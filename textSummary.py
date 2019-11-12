# Introduction---
# This python script is used to make the summary out of the extracted text. It is done using the python library Sumy,
# Sumy provides various algorithm with the help of which we can summarize the text like- Lex Rank, Text Rank, Luhn's etc..
# Using this library to summarize according to number of lines present in the text file.


import sumy
from sumy.parsers.plaintext import PlaintextParser
from sumy.nlp.tokenizers import Tokenizer
from sumy.nlp.stemmers import Stemmer
from sumy.utils import get_stop_words
from sumy.summarizers.lex_rank import LexRankSummarizer

if __name__ == '__main__':
	
	textFile = open(r'C:\Users\dell\video summariser\generated_text\generated_text.txt')
	text = textFile.read()
	textFile.close()
	number_of_lines = len(text.split('.'))

	parser = PlaintextParser.from_string(text,Tokenizer("english"))
	# Using LexRank
	summarizer = LexRankSummarizer()
	#Summarize the document with m sentences
	summary = summarizer(parser.document, ((number_of_lines//10)+1)*2)
	summarizedText = ''
	for sentence in summary:
		summarizedText += str(sentence)

	textFile = open(r'C:\Users\dell\video summariser\generated_text\generated_text.txt','w+')
	textFile.write(summarizedText)
	textFile.close()