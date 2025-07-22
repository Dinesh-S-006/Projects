import os
import time
import google.generativeai as genai
from dotenv import load_dotenv
from google.api_core.exceptions import ResourceExhausted

# Load API key from .env file
load_dotenv()
api_key = os.getenv("AIzaSyD-RhxHCvSmH1oAFIjLDQ_1yPY_8hXJaRY")

# Configure Gemini
genai.configure(api_key=api_key)

# Create chat model
model = genai.GenerativeModel("gemini-1.5-flash")  # Or "gemini-pro" if you prefer
chat = model.start_chat()

print("Gemini Chatbot Started! Type 'exit' to quit.\n")

while True:
    user_input = input("You: ")

    if user_input.lower() == "exit":
        print("Chatbot session ended.")
        break

    try:
        response = chat.send_message(user_input)
        print("Gemini:", response.text)

    except ResourceExhausted:
        print("Rate limit hit! Waiting for 60 seconds...")
        time.sleep(60)
        continue

    except Exception as e:
        print("Error:", e)
        break
