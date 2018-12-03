package cs125.illinois.cs125prep;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Questions extends MainActivity {

    private static final String TAG = "CS125Prep:Questions";
    private int wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wrong = 0;
        setContentView(R.layout.activity_questions);
        final TextView answer = findViewById(R.id.answer);
        answer.setEnabled(false);
        final Button q1cont = findViewById(R.id.q1cont);
        q1cont.setVisibility(View.INVISIBLE);
        q1cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Moving to next question");
                cont();
            }
        });
        final Button q1a = findViewById(R.id.q1a);
        q1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                wrong++;
                Log.d(TAG, "Incorrect answer selected");
                answer.setTextColor(Color.RED);
                answer.setText(R.string.Incorrect);
            }
        });
        final Button q1b = findViewById(R.id.q1b);
        q1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Correct answer selected");
                answer.setTextColor(Color.GREEN);
                answer.setText(R.string.Correct);
                score = score - (wrong * 10);
                if (score < 0) {
                    score = 0;
                }
                q1cont.setVisibility(View.VISIBLE);
            }
        });
        final Button q1c = findViewById(R.id.q1c);
        q1c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                wrong++;
                Log.d(TAG, "Incorrect answer selected");
                answer.setTextColor(Color.RED);
                answer.setText(R.string.Incorrect);
            }
        });
        final Button q1d = findViewById(R.id.q1d);
        q1d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                wrong++;
                Log.d(TAG, "Incorrect answer selected");
                answer.setTextColor(Color.RED);
                answer.setText(R.string.Incorrect);
            }
        });
    }
    void cont() {
        Intent intent = new Intent(this, Questions2.class);
        startActivity(intent);
    }
}
