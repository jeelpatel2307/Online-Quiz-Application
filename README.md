# Online Quiz Application

The Online Quiz Application is a simple Java console-based quiz where users can answer a series of questions and receive a score based on their responses.

## Project Structure

### 1. `Question.java`

- Represents the `Question` class with attributes such as the question itself, options, and the correct answer.
- Provides methods to display options, check if a user's answer is correct, and retrieve the correct answer.

### 2. `Quiz.java`

- Represents the `Quiz` class managing a quiz by storing a list of questions and the user's score.
- Provides a method `startQuiz()` to iterate through questions, display them, collect user answers, and calculate the final score.

### 3. `OnlineQuizApp.java`

- Main class to run the Online Quiz Application.
- Creates a list of questions, initializes a `Quiz` instance, and starts the quiz.

## How to Run

1. Save each class in separate `.java` files (e.g., `Question.java`, `Quiz.java`, `OnlineQuizApp.java`).
2. Compile the classes using the `javac` command:
    
    ```bash
    javac Question.java Quiz.java OnlineQuizApp.java
    
    ```
    
3. Run the program:
    
    ```bash
    java OnlineQuizApp
    
    ```
    

## Usage

1. Answer the series of questions presented during the quiz.
2. Receive feedback on each question, including whether the answer was correct or incorrect.
3. At the end of the quiz, view the final score.

## Customization

Feel free to customize and expand upon this project based on your requirements. You can add more questions, implement a timer for each question, or create a graphical user interface (GUI) for a better user experience.
