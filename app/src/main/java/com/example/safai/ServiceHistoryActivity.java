package com.example.safai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceHistoryActivity extends AppCompatActivity {

    private Button backButton; // Add this line

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_history);

        backButton = findViewById(R.id.backButton); // Add this line

        backButton.setOnClickListener(new View.OnClickListener() { // Add this block
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceHistoryActivity.this, WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}