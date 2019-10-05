package com.example.appbangiay.DanhSach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appbangiay.R;

public class DanhSachXacNhanDonHangActivity extends AppCompatActivity {
    public static Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh_danhsach_xacnhan_nhanvien_layout);

        //Get view from layout
//        Button btn_Thanhtoan = (Button) findViewById(R.id.btn_Thanhtoan);
//        Button btn_Thoat = (Button) findViewById(R.id.btn_Thoat);
//        intent = new Intent(DanhSachXacNhanDonHangActivity.this, DanhSachXacNhanDonHangActivity.class);
//        //Processing events
//        btn_Thanhtoan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                intent = new Intent(DanhSachXacNhanDonHangActivity.this, DanhSachXacNhanDonHangActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
//                startActivity(intent);
//            }
//        });
    }
}
