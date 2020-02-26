package me.codus.android_mvvm_sample;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

public class MVVMActivityViewModel extends ViewModel {

    public ObservableField<String> text = new ObservableField<>();
}
