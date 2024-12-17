# SpringAI
Spring AI integration with ChatGPT 4

You can fork/clone this codebase.

I have used Maven for this project. Once you build this app in your local machine, please make sure to update the API key from OpenAI. It is available with an open credit of $5 if you are new to OpenAI.

The below given commands needs to executed from the commandline from the directory the codebase is placed. The app is configured to listen port 38080. Once you have the app set up with the proper OpenAI keys, you can access content fro GPT 4 using this URL: http://localhost:38080/swagger-ui/index.html#/open-ai-controller/getAnswer

Use the below given commands to set this project in your local environment. This is built on Java 21 by the way :)
# mvn clean install
# mvn spring-boot:run
