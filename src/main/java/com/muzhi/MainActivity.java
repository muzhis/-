package com.muzhi;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_name)
    TextInputEditText tvName;
    @BindView(R.id.tv_password)
    TextInputEditText tvPassword;
    @BindView(R.id.ti_layout)
    TextInputLayout tiLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //监听动画
        tvName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                //TextInputLayout和TextInputEditText不同的提示效果
                if (s.length() > 6) {
                    tvName.setError("我是TextInputEditText的提示效果");
                }

                if(s.length() > 6){
                    tiLayout.setError("我是TextInputLayout的提示效果");
                }else{
                    tiLayout.setError("");
                }
            }
        });
    }
}
