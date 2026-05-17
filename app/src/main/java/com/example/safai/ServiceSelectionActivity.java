package com.example.safai;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ServiceSelectionActivity extends AppCompatActivity {

    private Button bookButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_selection);

        bookButton = findViewById(R.id.bookButton);

        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServiceSelectionActivity.this, AddressActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}