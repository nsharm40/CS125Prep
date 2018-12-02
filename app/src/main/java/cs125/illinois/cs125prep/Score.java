package cs125.illinois.cs125prep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView scoreResult = findViewById(R.id.scoreResult);
        scoreResult.setText("You got a score of " + Questions2.score + " points!");
    }
}
