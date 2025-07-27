# 🧠 AI-Powered Research Assistant Chrome Extension

A smart, AI-integrated Chrome extension that helps users summarize and analyze selected content from any webpage using Google Gemini API and a Spring Boot backend.

---

## 🚀 Features

- ✂️ **Summarize Text:** Highlight any text on a webpage and generate a clear, concise summary using Gemini API.
- 🔍 **Suggest Topics:** (Optional) Get topic suggestions and related reading based on selected content.
- 📝 **Save Notes:** Store your research notes locally with Chrome Storage.
- ⚡ **Real-time Integration:** Uses scripting APIs to fetch text, sends to backend, and renders results instantly.
- 🔐 **Secure & Scalable:** Clean code architecture with clear separation of controller, service, and DTO layers.

---

## 🛠️ Tech Stack

### Frontend (Chrome Extension)
- HTML, CSS, Vanilla JavaScript
- Chrome Extensions API (`manifest v3`)
- Local Storage APIs

### Backend (Spring Boot)
- Java 17+
- Spring Boot
- WebClient for external API calls
- Jackson for JSON parsing
- Google Gemini API

---

## 📁 Project Structure

```bash
Research-Assistant/
├── backend/
│   ├── src/main/java/com/research/assistant/
│   │   ├── ResearchController.java
│   │   ├── ResearchService.java
│   │   ├── ResearchRequest.java
│   │   └── GeminiResponse.java
│   └── application.properties
├── extension/
│   ├── sidepanel.html
│   ├── sidepanel.js
│   ├── sidepanel.css
│   └── manifest.json
└── README.md
⚙️ How It Works
User selects content on a webpage and clicks the "Summarize" button from the extension popup.

The selected text is extracted using Chrome’s scripting API and sent via a POST request to the backend API.

The Spring Boot server constructs a prompt and calls the Google Gemini API.

Gemini's AI-generated response is parsed and returned to the extension UI.

The result is displayed inside the extension panel, with an option to save notes.

🧪 API Example (Gemini)

Copy

curl "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent" \
  -H "Content-Type: application/json" \
  -H "X-goog-api-key: YOUR_GEMINI_API_KEY" \
  -X POST \
  -d '{
    "contents": [
      {
        "parts": [
          { "text": "Explain how AI works in a few words" }
        ]
      }
    ]
  }'
✅ Requirements
Java 17+

Node.js / Chrome browser for testing extension

Spring Boot CLI or IDE (e.g., IntelliJ)

Google Gemini API Key

🧩 Setup Instructions
1. Clone the Repository

Copy

git clone https://github.com/YourUsername/Research-Assistant.git
2. Run the Spring Boot Server
bash
Copy

cd backend
./mvnw spring-boot:run
Make sure to set your Gemini API key in application.properties:

properties
Copy

gemini.api.url=https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=
gemini.api.key=YOUR_GEMINI_API_KEY
3. Load the Extension in Chrome
Go to chrome://extensions/

Enable Developer Mode

Click Load Unpacked

Select the /extension folder

📸 Screenshots
Add screenshots here of extension UI, popup, summary display, etc.

📄 License
This project is licensed under the MIT License.

🙋‍♂️ Author
Akhilesh Yadav
🔗 Portfolio  https://akhileshyadav7007.github.io/Akhilesh_Portfolio/
🐙 GitHub
💼 LinkedIn https://www.linkedin.com/in/akhilesh-yadav-44a496216/

⭐️ Support
If you find this project useful, feel free to ⭐ the repo or share it with others!

---

Let me know if you’d like me to create a `manifest.json` file or add badge support
