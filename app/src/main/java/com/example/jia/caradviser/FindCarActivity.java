package com.example.jia.caradviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.List;

public class FindCarActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv;
    private Button bt;
    private Spinner sp;
    private CarExport carexport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_car);
        carexport = new CarExport();
        init_view();
    }

    private void init_view() {
        tv = (TextView) findViewById(R.id.textView);
        bt = (Button) findViewById(R.id.button);
        bt.setOnClickListener(this);
        sp = (Spinner) findViewById(R.id.spinner);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_car, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                String sp_text = sp.getSelectedItem().toString();
                List<String> list = carexport.getCars(sp_text);
                String st = new String();
                for (int i = 0; i < list.size(); i++) {
                    st = st + list.get(i) + "\n\n";
                }
                tv.setText(st);
                System.out.println("测试完成");
                String log=FindCarActivity.class.getSimpleName() ;
                Log.i("data", "ceshiyixia");
                break;
            default:
                break;
        }

    }
}
