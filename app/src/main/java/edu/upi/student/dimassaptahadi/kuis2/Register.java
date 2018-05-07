package edu.upi.student.dimassaptahadi.kuis2;
// Nama : Dimas Saptahadi
// Kelas : Ilkom C-2015
// Nim : 1501828
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    SharedPreferences session;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button register= findViewById(R.id.register);

        final EditText username= findViewById(R.id.username);
        final EditText password= findViewById(R.id.password);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tempUsername= String.valueOf(username.getText());
                String tempPassword= String.valueOf(password.getText());
                startActivity(new Intent(Register.this, main.class));
                finish();
            }
        });
    }
}
