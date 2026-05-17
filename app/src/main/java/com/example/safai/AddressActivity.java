package com.example.safai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddressActivity extends AppCompatActivity {

    private Button continueButton;
    private Button backButton; // Add this line

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        continueButton = findViewById(R.id.continueButton);
        backButton = findViewById(R.id.backButton); // Add this line

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddressActivity.this, OrderActivity.class);
                startActivity(intent);
                finish();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() { // Add this block
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddressActivity.this, ServiceSelectionActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}