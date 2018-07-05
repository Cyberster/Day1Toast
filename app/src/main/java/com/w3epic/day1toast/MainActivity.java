package com.w3epic.day1toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvName;
    EditText etName;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = (TextView)findViewById(R.id.tvName);
        etName = (EditText)findViewById(R.id.etName);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
    }

    public void onClickHandlerbtnSubmit(View view) {
        Toast.makeText(MainActivity.this, etName.getText().toString(), Toast.LENGTH_LONG).show();
    }
}
