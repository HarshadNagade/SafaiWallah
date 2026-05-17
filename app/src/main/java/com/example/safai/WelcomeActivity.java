package com.example.safai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button startCleanButton;
    private Button historyButton; // Add this line

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        startCleanButton = findViewById(R.id.startCleanButton);
        historyButton = findViewById(R.id.historyButton); // Add this line

        startCleanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, ServiceSelectionActivity.class);
                startActivity(intent);
                finish();
            }
        });

        historyButton.setOnClickListener(new View.OnClickListener() { // Add this block
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, ServiceHistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}