package onclickdemo.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by iii on 2017/9/7.
 */

public class ActList extends ListActivity {
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        SetChoice(user[position].toString());
    }

    private void SetChoice(String p) {

        Bundle bund = new Bundle();
        bund.putString("KK",p);
        Intent intent = new Intent();
        intent.putExtras(bund);
        setResult(0,intent);
        finish();
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        user = new String[]{"Marco", "Mary", "Peter", "Jason", "Jacky"};

        ListAdapter adap = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,user);


        this.setListAdapter(adap);
    }
    String[] user;
}
