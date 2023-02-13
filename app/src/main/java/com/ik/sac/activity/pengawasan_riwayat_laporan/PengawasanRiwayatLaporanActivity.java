package com.ik.sac.activity.pengawasan_riwayat_laporan;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.ik.sac.R;
import com.ik.sac.activity.dashboard.DashboardActivity;
import com.ik.sac.activity.insidentil_riwayat_laporan.InsidentilRiwayatLaporanActivity;
import com.ik.sac.activity.pengawasan_riwayat_detail.PengawasanRiwayatDetailActivity;
import com.ik.sac.utils.Tools;

public class PengawasanRiwayatLaporanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengawasan_riwayat_laporan);
        Tools.setSystemBarColorInt(this, Color.parseColor("#93013F"));

        LinearLayout btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(v -> {
            Intent i = new Intent(PengawasanRiwayatLaporanActivity.this, DashboardActivity.class);
            startActivity(i);
            finish();
        });

        LinearLayout btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(v -> {
            finish();
        });

    }

}