package sg.edu.rp.c346.p03_classjournal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.io.Serializable;


public class AddDetailsActivity extends AppCompatActivity {


    TextView tvWeek;
    ImageView imDG;
    TextView tvDG;
    RadioGroup rgGrade;
    RadioButton rb;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);

        tvWeek = (TextView) findViewById(R.id.textViewWeek);
        rgGrade = (RadioGroup) findViewById(R.id.radioGroup);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        // Get the intent
        Intent i = getIntent();


        Grade gd = (Grade) i.getSerializableExtra("grades");


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radio = rgGrade.getCheckedRadioButtonId();
               rb = findViewById(radio);
                String radiorb = rb.getText().toString();
                Intent i = new Intent();
                i.putExtra("submit", radiorb);
                setResult(RESULT_OK, i);
                finish();
            }
        });


    }
}