package com.example.appbangiay.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<DonHang>
{
    public MyAdapter(@NonNull Context context, int resource, @NonNull List<DonHang> objects) {
            super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //        final TextView txt_maDonHang = (TextView) convertView.findViewById(R.id.txt_MaDH);
//        final TextView txt_tenSanPham = (TextView) convertView.findViewById(R.id.txt_TenSP);
//        final TextView txt_soLuong = (TextView) convertView.findViewById(R.id.txt_SoLuong);
//        final TextView txt_size = (TextView) convertView.findViewById(R.id.txt_Size);
//        final TextView txt_tenKhachHang = (TextView) convertView.findViewById(R.id.txt_tenKH);
//        final TextView txt_soDienThoaiKH = (TextView) convertView.findViewById(R.id.txt_soDTKH);
//        final TextView txt_diaChiKH = (TextView) convertView.findViewById(R.id.txt_diaChiKH);
//        final TextView txt_tongTien = (TextView) convertView.findViewById(R.id.txt_TongTien);
//
//        final DonHang dh = listDonHang.get(position);
//        txt_maDonHang.setText(dh.getMaDH());
//        txt_tenSanPham.setText(dh.getTenSP());
//        txt_soLuong.setText(dh.getSoLuong());
//        txt_size.setText(dh.getSize());
//        txt_tenKhachHang.setText(dh.getTenKH());
//        txt_soDienThoaiKH.setText(dh.getSoDT());
//        txt_diaChiKH.setText(dh.getDiaChi());
//        txt_tongTien.setText(dh.getTongTien());
        return convertView;
    }




}


