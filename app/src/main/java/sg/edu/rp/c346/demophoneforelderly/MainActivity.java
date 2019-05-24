package sg.edu.rp.c346.demophoneforelderly;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnson;
    Button btndaughter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnson = findViewById(R.id.buttonCallSon);
        btndaughter = findViewById(R.id.buttonCallDaughter);


        btnson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCallSon = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ 92240336));
                startActivity(intentCallSon);
            }
        });

        btndaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCallDau = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: "+ 89675543));
                startActivity(intentCallDau);

            }
        });




    }



}
