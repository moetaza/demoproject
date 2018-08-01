package com.example.moetaz.mvptoturial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.moetaz.mvptoturial.root.App;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View {

    @Inject
    LoginActivityMVP.Presenter presenter;
    private EditText firstname ,lastname;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App)getApplication()).getComponent().inject(this);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);
        button = findViewById(R.id.loginbutton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.loginButtonClicked();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstname() {
        return firstname.getText().toString();
    }

    @Override
    public String getLastname() {
        return lastname.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this, "User not available", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showInputError() {
        Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSavedMessage() {
        Toast.makeText(this, "User saved successfully", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFirstname(String name) {
        firstname.setText(name);

    }

    @Override
    public void setLastname(String name) {
        lastname.setText(name);
    }
}
