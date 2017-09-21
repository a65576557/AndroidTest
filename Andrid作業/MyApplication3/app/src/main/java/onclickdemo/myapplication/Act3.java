package onclickdemo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act3);

        Intent intent = getIntent();
        Bundle bund = intent.getExtras();
        String data = bund.getString("KK");
        TextView txtact3 = (TextView)findViewById(R.id.txtact3);
        txtact3.setText(data);
    }
}
