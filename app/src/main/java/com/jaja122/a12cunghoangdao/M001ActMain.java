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
    binding.tvHuyen.setText("12");

    }

    @Override
    public void onClick(View view) {

    }
}
