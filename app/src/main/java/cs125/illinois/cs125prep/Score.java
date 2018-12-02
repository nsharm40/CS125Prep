package cs125.illinois.cs125prep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView scoreResult = findViewById(R.id.scoreResult);
        TextView motive = findViewById(R.id.motive);
        ImageView pic = findViewById(R.id.finImage);
        scoreResult.setText("You got a score of " + Questions2.score + " points!");
        if (Questions2.score > 90) {
            motive.setText("Geoff is pleased!");
            pic.setImageResource(R.drawable.chuchu);
        } else if (Questions2.score > 70) {
            motive.setText("Keep it up! You're getting there!");
            pic.setImageResource(R.drawable.keep);
        } else if (Questions2.score > 50) {
            motive.setText("Time to revisit some slides!");
            pic.setImageResource(R.drawable.slides);
        } else {
            motive.setText("You might want to spend some time in office horus!");
            pic.setImageResource(R.drawable.siebel);
        }
        final Button replay = findViewById(R.id.replay);
        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont();
            }
        });
    }
    void cont() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
