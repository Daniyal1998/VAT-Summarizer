# Introduction---
# This python script is just to extract text from the images. So we are using tesseract to solve the problem.
# After extracting the text we are storing it as a .txt file.

import os
from PIL import Image
import pytesseract

if __name__ == '__main__':
	filPath = r'C:\Users\dell\video summariser\imageJava\image.png'
	text = pytesseract.image_to_string(Image.open(filePath))
	os.remove(filePath)
	print(text)

	text_file = open(r'C:\Users\dell\video summariser\generated_text\generated_text.txt','w+')
	text_file.write(text)
	text_file.close()