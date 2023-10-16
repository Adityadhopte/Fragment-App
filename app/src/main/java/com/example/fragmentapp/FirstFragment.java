package com.example.fragmentapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class FirstFragment extends Fragment {

    Button button;
    TextView textView;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        Toast.makeText(context, "onAttach() is called" , Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getActivity(), "onCreate() is called" , Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onResume() {
        super.onResume();

        Toast.makeText(getActivity(), "onResume() is called" , Toast.LENGTH_SHORT).show();

    }

//    @Override
//    public void onStart() {
//        super.onStart();
//
//        Toast.makeText(getActivity(), "onStart() is called" , Toast.LENGTH_SHORT).show();
//
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_first,container,false);

        button = view.findViewById(R.id.btn_frag1);
        textView = view.findViewById(R.id.text_frag1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Welcome to the Fragment", Toast.LENGTH_SHORT).show();

            }
        });

        return  view;
    }
}