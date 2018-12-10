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

public class Question3 extends Questions2 {

    private static final String TAG = "CS125Prep:Question3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        final TextView answer3 = findViewById(R.id.answer3);
        answer3.setEnabled(false);
        final Button q3cont = findViewById(R.id.q3cont);
        q3cont.setVisibility(View.INVISIBLE);
        q3cont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Moving to next question");
                cont();
            }
        });
        final Button q3a = findViewById(R.id.q3a);
        q3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score++;
                Log.d(TAG, "Incorrect answer selected");
                answer3.setTextColor(Color.RED);
                answer3.setText(R.string.Incorrect);
            }
        });
        final Button q3b = findViewById(R.id.q3b);
        q3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score++;
                Log.d(TAG, "Incorrect answer selected");
                answer3.setTextColor(Color.RED);
                answer3.setText(R.string.Incorrect);
            }
        });
        final Button q3c = findViewById(R.id.q3c);
        q3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                score++;
                Log.d(TAG, "Incorrect answer selected");
                answer3.setTextColor(Color.RED);
                answer3.setText(R.string.Incorrect);
            }
        });
        final Button q3d = findViewById(R.id.q3d);
        q3d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                Log.d(TAG, "Correct answer selected");
                answer3.setTextColor(Color.GREEN);
                answer3.setText(R.string.Correct);
                q3cont.setVisibility(View.VISIBLE);
            }
        });
    }

    void cont() {
        Intent intent = new Intent(this, Question4.class);
        startActivity(intent);
        myTTS.speak("What steps do you need for recursion?",
                TextToSpeech.QUEUE_FLUSH, null);
    }
}

