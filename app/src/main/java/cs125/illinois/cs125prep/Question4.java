package cs125.illinois.cs125prep;

import android.content.Intent;
import android.graphics.Color;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Question4 extends Question3 {

    private static final String TAG = "CS125Prep:Question4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        final TextView answer4 = findViewById(R.id.answer4);
        answer4.setEnabled(false);
        final Button q4cont = findViewById(R.id.q4cont);
        q4cont.setVisibility(View.INVISIBLE);
        q4cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Moving to next question");
                cont();
            }
        });
        final Button q4a = findViewById(R.id.q4a);
        q4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score++;
                Log.d(TAG, "Incorrect answer selected");
                answer4.setTextColor(Color.RED);
                answer4.setText(R.string.Incorrect);
            }
        });
        final Button q4b = findViewById(R.id.q4b);
        q4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Correct answer selected");
                answer4.setTextColor(Color.GREEN);
                answer4.setText(R.string.Correct);
                q4cont.setVisibility(View.VISIBLE);
            }
        });
        final Button q4c = findViewById(R.id.q4c);
        q4c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score++;
                Log.d(TAG, "Incorrect answer selected");
                answer4.setTextColor(Color.RED);
                answer4.setText(R.string.Incorrect);
            }
        });
        final Button q4d = findViewById(R.id.q4d);
        q4d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score++;
                Log.d(TAG, "Incorrect answer selected");
                answer4.setTextColor(Color.RED);
                answer4.setText(R.string.Incorrect);
            }
        });
    }
    void cont() {
        Intent intent = new Intent(this, Question5.class);
        startActivity(intent);
        myTTS.speak("What is Jeff's middle name?",
                TextToSpeech.QUEUE_FLUSH, null);
    }
}

