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

public class Questions2 extends Questions {

    private static final String TAG = "CS125Prep:Questions2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions2);
        final TextView answer2 = findViewById(R.id.answer2);
        answer2.setEnabled(false);
        final Button q2cont = findViewById(R.id.q2cont);
        q2cont.setVisibility(View.INVISIBLE);
        q2cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Moving to next question");
                cont();
            }
        });
        final Button q2a = findViewById(R.id.q2a);
        q2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score++;
                Log.d(TAG, "Incorrect answer selected");
                answer2.setTextColor(Color.RED);
                answer2.setText(R.string.Incorrect);
            }
        });
        final Button q2b = findViewById(R.id.q2b);
        q2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score++;
                Log.d(TAG, "Incorrect answer selected");
                answer2.setTextColor(Color.RED);
                answer2.setText(R.string.Incorrect);
            }
        });
        final Button q2c = findViewById(R.id.q2c);
        q2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score++;
                Log.d(TAG, "Incorrect answer selected");
                answer2.setTextColor(Color.RED);
                answer2.setText(R.string.Incorrect);
            }
        });
        final Button q2d = findViewById(R.id.q2d);
        q2d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Correct answer selected");
                answer2.setTextColor(Color.GREEN);
                answer2.setText(R.string.Correct);
                q2cont.setVisibility(View.VISIBLE);
            }
        });
    }
    void cont() {
        Intent intent = new Intent(this, Question3.class);
        startActivity(intent);
        myTTS.speak("What kind of language is java?",
                TextToSpeech.QUEUE_FLUSH, null);
    }
}
