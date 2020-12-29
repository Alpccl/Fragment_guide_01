package com.crisspian.fragment_guide_01;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.crisspian.fragment_guide_01.databinding.FragmentToastQuestionBinding;

import static android.widget.Toast.*;


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

       mBinding.RadioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup RadioGroup1, int i) {
               int index = mBinding.RadioGroup1.indexOfChild(mBinding.RadioGroup1.findViewById(i));
               switch (index){
                   case 0:
                       Toast.makeText(getContext(), "Respuesta Correcta" , LENGTH_SHORT).show();
                       mBinding.textCuestion.setText("Respuesta Correcta");
                   case 1:
                       Toast.makeText(getContext(), "Se ha Equivocado", LENGTH_SHORT).show();
                       mBinding.textCuestion.setText("Se ha equivocado, jeje");
               }

           }
       });
        };
    }
