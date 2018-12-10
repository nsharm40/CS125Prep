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

public class Question5 extends Question4 {

    private static final String TAG = "CS125Prep:Question5";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        final TextView answer5 = findViewById(R.id.answer5);
        answer5.setEnabled(false);
        final Button q5cont = findViewById(R.id.q5cont);
        q5cont.setVisibility(View.INVISIBLE);
        q5cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Moving to next question");
                cont();
            }
        });
        final Button q5a = findViewById(R.id.q5a);
        q5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Correct answer selected");
                answer5.setTextColor(Color.GREEN);
                answer5.setText(R.string.Correct);
                q5cont.setVisibility(View.VISIBLE);
            }
        });
        final Button q5b = findViewById(R.id.q5b);
        q5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Incorrect answer selected");
                answer5.setTextColor(Color.RED);
                answer5.setText(R.string.Incorrect);
            }
        });
        final Button q5c = findViewById(R.id.q5c);
        q5c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Incorrect answer selected");
                answer5.setTextColor(Color.RED);
                answer5.setText(R.string.Incorrect);
            }
        });
        final Button q5d = findViewById(R.id.q5d);
        q5d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Incorrect answer selected");
                answer5.setTextColor(Color.RED);
                answer5.setText(R.string.Incorrect);
            }
        });
    }
    void cont() {
        Intent intent = new Intent(this, Score.class);
        startActivity(intent);
        myTTS.speak("Good work!",
                TextToSpeech.QUEUE_FLUSH, null);
    }
}

