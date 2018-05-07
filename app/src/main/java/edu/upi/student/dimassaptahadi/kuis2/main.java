package edu.upi.student.dimassaptahadi.kuis2;
// Nama : Dimas Saptahadi
// Kelas : Ilkom C-2015
// Nim : 1501828
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button transferSaldo= findViewById(R.id.transfer);

        Button logout= findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        transferSaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(main.this, Transfer.class));
                finish();
            }
        });
    }
}
