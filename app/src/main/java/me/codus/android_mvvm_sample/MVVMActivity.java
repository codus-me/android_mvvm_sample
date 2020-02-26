package me.codus.android_mvvm_sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import me.codus.android_mvvm_sample.databinding.ActivityMvvmBinding;

public class MVVMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMvvmBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        MVVMActivityViewModel viewModel = new MVVMActivityViewModel();
        viewModel.text.set(String.valueOf(1000));
        dataBinding.setModel(viewModel);
    }
}
