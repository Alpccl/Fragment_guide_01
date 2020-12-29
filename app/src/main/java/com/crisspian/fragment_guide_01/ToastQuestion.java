package com.crisspian.fragment_guide_01;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.crisspian.fragment_guide_01.databinding.FragmentToastQuestionBinding;


public class ToastQuestion extends Fragment {

    private FragmentToastQuestionBinding mBinding;

    public ToastQuestion() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentToastQuestionBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mBinding.RadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int index = mBinding.RadioGroup.indexOfChild(mBinding.RadioGroup.findViewById(i));
                switch (index) {
                    case 0:
                        mBinding.textView.setText("Si lo Conozco");
                        break;
                    case 1:
                        mBinding.textView.setText("no lo conozco");
                }
            }
        });
    }
}