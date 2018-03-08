/*=====================================================================
□ Infomation
  ○ Data : 08.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ 그리드 뷰
  ○ BaseAdapter 활용
  ○ Item 추가 기능

□ Study
  ○
=====================================================================*/
package com.eun1310434.gridview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText_title;
    EditText editText_contents;

    GridView gridView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setNumColumns(3);

        adapter = new Adapter(getApplicationContext());

        adapter.addItem(new ItemData("Title - a", "Contents - a", 0, R.drawable.img_a));
        adapter.addItem(new ItemData("Title - b", "Contents - b", 1, R.drawable.img_b));
        adapter.addItem(new ItemData("Title - c", "Contents - c", 2, R.drawable.img_c));
        adapter.addItem(new ItemData("Title - d", "Contents - d", 3, R.drawable.img_d));
        adapter.addItem(new ItemData("Title - e", "Contents - e", 4, R.drawable.img_e));

        gridView.setAdapter(adapter);


        editText_title = (EditText) findViewById(R.id.editText_title);
        editText_contents = (EditText) findViewById(R.id.editText_contents);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = editText_title.getText().toString();
                String contents = editText_contents.getText().toString();
                adapter.addItem(new ItemData(title, contents, adapter.getCount() , R.drawable.img_c));
                adapter.notifyDataSetChanged();
            }
        });


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ItemData item = (ItemData) adapter.getItem(position);
                String msg = item.getTitle() + " ("+(position / gridView.getNumColumns())+" , "+(position % gridView.getNumColumns()+")");
                Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
            }
        });
    }
}