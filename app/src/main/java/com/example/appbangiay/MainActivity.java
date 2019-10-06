package com.example.appbangiay;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    Button btnMua;
    Button btnTroVe;
    TextView txtTenSanPham;
    TextView txtSize;
    TextView txtSoLuong;
    TextView txtMau;
    TextView txtHang;
    TextView txtGiaTien;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh_thongtin_sanpham_layout);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference("Tên sản phẩm");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue().toString();
                txtTenSanPham.setText(value);
                txtSize.setText(value);
                txtSoLuong.setText(value);
                txtHang.setText(value);
                txtMau.setText(value);
                txtGiaTien.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //Màn hình thông tin sản phẩm
        ThongTinSanPham();

        //Click button Mua
        btnMua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //Click button Trở về
        btnTroVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.manhinh_chinh_layout);
            }
        });


    }

    public void ThongTinSanPham(){
        txtTenSanPham = (TextView)findViewById(R.id.txt_TenSanPham);
        txtSize = (TextView)findViewById(R.id.txt_Size);
        txtSoLuong = (TextView)findViewById(R.id.txt_SoLuong);
        txtMau = (TextView)findViewById(R.id.txt_Mau);
        txtHang = (TextView)findViewById(R.id.txt_Hang);
        txtGiaTien = (TextView)findViewById(R.id.txt_Giatien);
        btnMua = (Button)findViewById(R.id.btn_Mua);
        btnTroVe = (Button)findViewById(R.id.btn_TroVe);
    }


}
