package com.example.appbangiay;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh_thanhtoan_layout);
        //1. Khởi tạo dữ liệu cho mảng arr (còn gọi là data source)
        final String arr[] = {"Teo", "2", "1", "3"};
        //2. Lấy đối tượng Listview dựa vào id
        ListView lv = (ListView) findViewById(R.id.listview_manghinh_thanhtoan);
        //3. Gán Data source vào ArrayAdapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, arr);
        //4. Đưa Data source vào ListView
        lv.setAdapter(adapter);
        final TextView txt = (TextView) findViewById(R.id.txt_tensanpham_lsv);
        //5. Thiết lập sự kiện cho Listview, khi chọn phần tử nào thì hiển thị lên TextView
        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0,
                                            View arg1,
                                            int arg2,
                                            long arg3) {
                        //đối số arg2 là vị trí phần tử trong Data Source (arr)
                        txt.setText("position :" + arg2 + " ; value =" + arr[arg2]);
                    }
                });
    }}


