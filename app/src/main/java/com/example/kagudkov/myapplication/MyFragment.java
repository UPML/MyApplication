package com.example.kagudkov.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import static android.widget.Toast.LENGTH_SHORT;

public class MyFragment extends Fragment {

    private Button mHideButton;
    private Button mShowButton;
    private TextView mHelloTextView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  v = inflater.inflate(R.layout.fragment_layout, container, false);
        mHideButton = (Button) v.findViewById(R.id.fragment_hide_button);
        mShowButton = (Button) v.findViewById(R.id.fragment_show_button);
        mHelloTextView = (TextView) v.findViewById(R.id.fragment_hello_textView);
        mHideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mHelloTextView.getVisibility() != TextView.INVISIBLE) {
                    mHelloTextView.setVisibility(TextView.INVISIBLE);
                } else {
                    Toast.makeText(getContext(), R.string.already_hided, LENGTH_SHORT).show();
                }
            }
        });
        mShowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mHelloTextView.getVisibility() != TextView.VISIBLE) {
                    mHelloTextView.setVisibility(TextView.VISIBLE);
                } else {
                    Toast.makeText(getContext(), R.string.already_showed, LENGTH_SHORT).show();
                }
            }
        });


        return v;

    }
}