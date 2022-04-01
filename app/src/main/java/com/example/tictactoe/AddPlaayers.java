package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddPlaayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_plaayers);

        final EditText playerOne = findViewById(R.id.playerOneName);
        final EditText playerTwo = findViewById(R.id.playerTwoName);
        final Button startGameBtn = findViewById(R.id.startGameBtn);

        startGameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getPlayerOneName, getPlayerTwoName;
                 getPlayerOneName = playerOne.getText().toString();
                 getPlayerTwoName = playerTwo.getText().toString();
                 
                 if (getPlayerOneName.isEmpty() || getPlayerTwoName.isEmpty()){
                     Toast.makeText(AddPlaayers.this, "Please Enter Player Name", Toast.LENGTH_SHORT).show();
                 }else {
                     Intent intent = new Intent(AddPlaayers.this,MainActivity.class);
                     intent.putExtra("playerOne",getPlayerOneName);
                     intent.putExtra("playreTwo",getPlayerTwoName);
                     startActivity(intent);
                     finish();
                 }
            }
        });
    }
}