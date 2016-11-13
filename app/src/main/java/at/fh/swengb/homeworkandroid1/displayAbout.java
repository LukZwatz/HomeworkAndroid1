package at.fh.swengb.homeworkandroid1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class displayAbout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_about);

        Intent intent = getIntent();
        String message1 = intent.getStringExtra("myMessage");
        String message2 = intent.getStringExtra("myMessage2");

        TextView view1 = (TextView) findViewById(R.id.textView4);
        TextView view2 = (TextView) findViewById(R.id.textView12);

        view1.setText(message1);
        view2.setText(message2);
    }
}
