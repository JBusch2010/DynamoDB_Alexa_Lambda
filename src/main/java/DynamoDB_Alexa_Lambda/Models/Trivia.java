package DynamoDB_Alexa_Lambda.Models;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.ArrayList;
import java.util.List;


@DynamoDBTable(tableName = "Trivia")
    public class Trivia {
        private String id;
        private String question;
        private String category;
        private String type;
        private String difficulty;
        private String correct_answer;
//        private List<Incorrect_Answers> incorrect_answers = new ArrayList<>();


    public Trivia() {}
        public Trivia(String type) {
            this.type = type;
        }
        @DynamoDBHashKey
        @DynamoDBAutoGeneratedKey
        public String getId() {
            return id;
        }
        @DynamoDBAttribute
        public String getCategory() {
            return this.category;
        }
        public void setCategory(String category) {
            this.category = category;
        }
        public void setId(String id) {
            this.id = id;
        }
        @DynamoDBAttribute
        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }
        @DynamoDBAttribute
    public String getDifficulty() {
        return difficulty;
    }
    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @DynamoDBAttribute
    public String getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer (String correct_answer) {
        this.correct_answer = correct_answer;
    }

    public String getQuestion () {
        return question;
    }

    public void setQuestion (String question) {
        this.question = question;
    }

//    @DynamoDBAttribute
//    public List<Incorrect_Answers> getIncorrect_Answers() { return incorrect_answers; }
//    public void setIncorrect_answers(List<Incorrect_Answers> incorrect_answers) { this.incorrect_answers = incorrect_answers; }
//    public void addIncorrect_answers(Incorrect_Answers incorrect_answers) { this.incorrect_answers.add(incorrect_answers); }

}
