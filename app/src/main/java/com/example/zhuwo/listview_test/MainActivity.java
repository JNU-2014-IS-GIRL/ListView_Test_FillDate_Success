package com.example.zhuwo.listview_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //定义一个String数组用来显示ListView的内容
    private static  final String[] strs = new String[]{
            "first", "second", "third", "fourth", "fifth"
    };

    //Call when the activity is first created.
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //得到ListView对象的引用
        lv = (ListView) findViewById(R.id.lv);

        //为ListView设置Adapter来绑定数据

        //①最简单的列表形式
        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, strs));

        //②稍微复杂一点的带选框的方式
        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_checked, strs));
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //③带有CheckBox的选框的ListView
        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_multiple_choice, strs));
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        //④带RadioButton的ListView，注意这个资源并不是指定了单选
        lv.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice, strs));
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

    }
}
