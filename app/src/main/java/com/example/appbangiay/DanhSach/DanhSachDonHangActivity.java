package com.example.appbangiay.DanhSach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.app.Activity;

import com.example.appbangiay.Adapter.MyAdapter;
import com.example.appbangiay.R;

import java.util.ArrayList;

public class DanhSachDonHangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh_danhsach_donhang_layout);

//        ListView listView = (ListView) findViewById(R.id.list);
//        //Get view from layout
//        Button btn_Thanhtoan = (Button) findViewById(R.id.btn_Thanhtoan);
//        Button btn_Thoat = (Button) findViewById(R.id.btn_Thoat);
//       final Intent intent = new Intent(DanhSachDonHangActivity.this, DanhSachXacNhanDonHangActivity.class);
//        //Processing events
//
//
//        btn_Thoat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               finish();
//            }
//        });
//        btn_Thanhtoan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(DanhSachDonHangActivity.this,DanhSachXacNhanDonHangActivity.class);
//                startActivity(intent);
//            }
//        });
    }

}
