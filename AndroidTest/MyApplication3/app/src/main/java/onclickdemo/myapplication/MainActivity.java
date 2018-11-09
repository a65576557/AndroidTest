package onclickdemo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private View.OnClickListener btnGo_Onclick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            Intent intent = new Intent(MainActivity.this,Act2.class);

            startActivity(intent);
        }
    };
    private View.OnClickListener btnAct3_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Bundle bund = new Bundle();
            bund.putString("KK","Sheldon");

            Intent intent = new Intent(MainActivity.this,Act3.class);
            intent.putExtras(bund);
            startActivity(intent);

        }
    };
    private View.OnClickListener btnRecive_Click = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Act4.class);
            startActivityForResult(intent,9487);


        }
    };
    private View.OnClickListener btnActList_OnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(MainActivity.this,ActList.class);
            startActivity(intent);
            startActivityForResult(intent,1234);
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==9487)
        {
            if(data==null)
            {txtHello.setText("沒有設定管理員");
            return;
            }
            if(data.getExtras()==null)
            {txtHello.setText("沒有包裹");
            return;
            }
            else txtHello.setText("結果:"+data.getExtras().getString("KK"));

        }
        if(requestCode==1234)
        {
            if(data==null)
            {txtHello.setText("沒有設定管理員");
                return;
            }
            if(data.getExtras()==null)
            {txtHello.setText("沒有包裹");
                return;
            }
            else txtHello.setText("結果:"+data.getExtras().getString("KK"));

        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitialComponent();

    }

    private void InitialComponent() {
        txtHello=(TextView) findViewById(R.id.txtHello);
        btnGo=(Button) findViewById(R.id.btnGo);
        btnGo.setOnClickListener(btnGo_Onclick);
        btnAct3=(Button) findViewById(R.id.btnAct3);
        btnAct3.setOnClickListener(btnAct3_Click);
btnRecive = (Button)findViewById(R.id.btnReacive);
        btnRecive.setOnClickListener(btnRecive_Click);
        btnActList=(Button)findViewById(R.id.btnActList);
        btnActList.setOnClickListener(btnActList_OnClick);



    }
    TextView txtHello;
            Button btnGo;
Button btnAct3;
    Button btnRecive;
    Button btnActList;
}
