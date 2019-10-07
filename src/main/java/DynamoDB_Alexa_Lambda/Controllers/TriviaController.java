package DynamoDB_Alexa_Lambda.Controllers;

import DynamoDB_Alexa_Lambda.Models.Incorrect_Answers;
import DynamoDB_Alexa_Lambda.Models.Trivia;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.*;

public class TriviaController {

    private DynamoDB dynamoDb;
    private String DYNAMODB_TABLE_NAME = "Trivia";
    private Regions REGION = Regions.US_WEST_2;

    public Trivia save(Trivia[] trivia) {
        for(int i = 0; i < trivia.length; i++) {


            final AmazonDynamoDB ddb = AmazonDynamoDBClientBuilder.defaultClient();
            DynamoDBMapper ddbMapper = new DynamoDBMapper(ddb);

            Incorrect_Answers incorrect_answers = new Incorrect_Answers();

            ddbMapper.save(trivia[i]);
            ddbMapper.save(incorrect_answers);
        }
        return trivia[0];
    }
}
