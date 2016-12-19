package com.karenfreemansmith.flashcards.ui;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.karenfreemansmith.flashcards.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewAccountActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Bind(R.id.editTextName) EditText mName;
    @Bind(R.id.editTextEmail) EditText mEmail;
    @Bind(R.id.editTextPassword) EditText mPassword;
    @Bind(R.id.editTextConfirm) EditText mConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
        ButterKnife.bind(this);

        mAuth = FirebaseAuth.getInstance();
    }

    @OnClick(R.id.buttonRegister)
    public void register() {
        createNewUser();
        Intent intent = new Intent(NewAccountActivity.this, MainActivity.class);
        startActivity(intent);
    }

    private void createNewUser() {
        final String name = mName.getText().toString().trim();
        final String email = mEmail.getText().toString().trim();
        final String password = mPassword.getText().toString().trim();
        final String confirm = mConfirm.getText().toString().trim();

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()) {
                            Toast.makeText(NewAccountActivity.this, "Authentication Successful", Toast.LENGTH_LONG);
                        } else {
                            Toast.makeText(NewAccountActivity.this, "Authentication Failed", Toast.LENGTH_LONG);
                        }
                    }
                });

    }
}
