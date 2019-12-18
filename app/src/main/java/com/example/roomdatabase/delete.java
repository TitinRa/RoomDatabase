package com.example.roomdatabase;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class delete { public class RecyclerViewAdapter extends RecyclerView.Adapter{

}

    private ArrayList namaList; //Digunakan untuk Nama
    private ArrayList nimList; //Digunakan untuk Jurusan
    private ArrayList kejuruanList; //Digunakan untuk kejujuran
    private ArrayList alamatList; // Digunakan untuk alamat
    private Context context; //Membuat Variable Context

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    RecyclerViewAdapter(ArrayList namaList, ArrayList nimList, ArrayList kejuruanList, ArrayList alamatList){
        this.namaList = namaList;
        this.nimList = nimList;
        this.kejuruanList = kejuruanList;
        this.alamatList = alamatList;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private final View Nama, Kejuruan, Nim, Alamat;
        private TextView Nama, Kejuruan, Nim, Alamat;


        ViewHolder(View itemView) {
            super(itemView);

            //Mendapatkan Context dari itemView yang terhubung dengan Activity ViewData
            context = itemView.getContext();

            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            Nama = itemView.findViewById(R.id.Nama);
            Nim = itemView.findViewById(R.id.Nim);
            Kejuruan = itemView.findViewById(R.id.Kejuruan);
           Alamat = itemView.findViewById(R.id.Alamat);

        }
    }
}
