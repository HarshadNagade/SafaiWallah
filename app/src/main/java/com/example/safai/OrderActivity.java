package com.example.safai;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderActivity extends AppCompatActivity {

    private Button sendOrderButton;
    private Button backButton; // Add this line

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        sendOrderButton = findViewById(R.id.sendOrderButton);
        backButton = findViewById(R.id.backButton); // Add this line

        sendOrderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, PaymentActivity.class);
                startActivity(intent);
                finish();
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() { // Add this block
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, AddressActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}