package win.yulongsun.androidsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import win.yulongsun.androidsample.edittext.EditTextActivity;
import win.yulongsun.androidsample.handler.Handler1Activity;
import win.yulongsun.androidsample.handler.Handler2Activity;
import win.yulongsun.androidsample.jni.JNIActivity;
import win.yulongsun.androidsample.superadapter.SuperAdapterListViewActivity;
import win.yulongsun.androidsample.superadapter.SuperAdapterRVActivity;
import win.yulongsun.androidsample.test.UITestActivity;
import win.yulongsun.androidsample.view.ViewSampleActivity;
import win.yulongsun.androidsample.webview.WebViewSample;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);
        init();
    }

    public void init() {
        String[]             str     = {"handler1", "handler2","UITest","SuperAdapterListView","SuperAdapterRV","EditText","WebViewSample","ViewSampleActivity","JNIActivity"};
        List<String>         mDatas  = Arrays.asList(str);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, mDatas);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }


    @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(this, Handler1Activity.class);
                break;
            case 1:
                intent = new Intent(this, Handler2Activity.class);
                break;
            case 2:
                intent = new Intent(this, UITestActivity.class);
                break;
            case 3://SuperAdapterListView
                intent = new Intent(this, SuperAdapterListViewActivity.class);
                break;
            case 4://SuperAdapterRV
                intent = new Intent(this, SuperAdapterRVActivity.class);
                break;
            case 5:
                intent = new Intent(this, EditTextActivity.class);
                break;
            case 6:
                intent = new Intent(this, WebViewSample.class);
                break;
            case 7:
                intent = new Intent(this, ViewSampleActivity.class);
                break;
            case 8:
                intent = new Intent(this, JNIActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
