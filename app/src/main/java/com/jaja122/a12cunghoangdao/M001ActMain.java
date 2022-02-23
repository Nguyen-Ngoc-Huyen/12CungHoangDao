package com.jaja122.a12cunghoangdao;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jaja122.a12cunghoangdao.databinding.M001MainActBinding;

public class M001ActMain extends AppCompatActivity implements View.OnClickListener {
    private M001MainActBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle data) {
        super.onCreate(data);
        binding = M001MainActBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initViews();

    }

    private void initViews() {
        // Nơi đăng ký tổng đài lắng nghe sự kiện
        binding.ivBachDuong.setOnClickListener(this);
        binding.ivBaoBinh.setOnClickListener(this);
        binding.ivBoCap.setOnClickListener(this);
        binding.ivCuGiai.setOnClickListener(this);
        binding.ivKimNguu.setOnClickListener(this);
        binding.ivMaKet.setOnClickListener(this);
        binding.ivNhanMa.setOnClickListener(this);
        binding.ivSongNgu.setOnClickListener(this);
        binding.ivSongTu.setOnClickListener(this);
        binding.ivSuTu.setOnClickListener(this);
        binding.ivThienBinh.setOnClickListener(this);
        binding.ivXuNu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id_IV = view.getId();
        int context, icon, title2;
        switch (id_IV) {
            case R.id.iv_bach_duong: {
                context = R.string.bach_duong_text;
                icon = R.drawable.ic_bach_duong;
                title2 = R.string.bach_duong_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_bao_binh: {
                context = R.string.bao_binh_text;
                icon = R.drawable.ic_bao_binh;
                title2 = R.string.bao_binh_title2;
                setContent(icon, title2, context);

                break;
            }
            case R.id.iv_bo_cap: {
                context = R.string.bo_cap_text;
                icon = R.drawable.ic_bocap;
                title2 = R.string.bo_cap_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_cu_giai: {
                context = R.string.cu_giai_text;
                icon = R.drawable.ic_cu_giai;
                title2 = R.string.cu_giai_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_kim_nguu: {
                context = R.string.kim_nguu_text;
                icon = R.drawable.ic_kim_nguu;
                title2 = R.string.kim_nguu_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_ma_ket: {
                context = R.string.ma_ket_text;
                icon = R.drawable.ic_ma_ket;
                title2 = R.string.ma_ket_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_nhan_ma: {
                context = R.string.nhan_ma_text;
                icon = R.drawable.ic_nhan_ma;
                title2 = R.string.nhan_ma_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_song_ngu: {
                context = R.string.song_ngu_text;
                icon = R.drawable.ic_song_ngu;
                title2 = R.string.song_ngu_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_song_tu: {
                context = R.string.song_tu_text;
                icon = R.drawable.ic_song_tu;
                title2 = R.string.song_tu_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_su_tu: {
                context = R.string.su_tu_text;
                icon = R.drawable.ic_su_tu;
                title2 = R.string.su_tu_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_thien_binh: {
                context = R.string.thien_binh_text;
                icon = R.drawable.ic_thien_binh;
                title2 = R.string.thien_binh_title2;
                setContent(icon, title2, context);
                break;
            }
            case R.id.iv_xu_nu: {
                context = R.string.xu_nu_text;
                icon = R.drawable.ic_xu_nu;
                title2 = R.string.xu_nu_title2;
                setContent(icon, title2, context);
                break;
            }
        }
    }

    private void setContent(int icon, int title2, int context) {
        binding.ivIcon.setImageResource(icon);
        binding.tvTitle2.setText(title2);
        binding.tvContext.setText(context);
    }
}
