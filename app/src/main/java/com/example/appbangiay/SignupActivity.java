package com.example.appbangiay;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.appbangiay.datamodel.DangKy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.AsyncListUtil;

public class SignupActivity <firebaseAuth> extends AppCompatActivity {
     Button sign_up;
     EditText sign_up_email;
     EditText sign_up_password;
     EditText sign_up_password_confirm;
     private FirebaseAuth mAuth;

     private  FirebaseAuth firebaseAuth ;

     @Override
     protected void onCreate(@Nullable Bundle savedInstanceState) {

          super.onCreate(savedInstanceState);
          setContentView(R.layout.manhinh_dangky);

          getSupportActionBar().setTitle("Đăng Ký");

          sign_up_email = (EditText) findViewById(R.id.sign_up_email);
          sign_up_password = (EditText) findViewById(R.id.sign_up_password);
          sign_up_password_confirm = (EditText) findViewById(R.id.sign_up_password_confirm);
          sign_up = (Button) findViewById(R.id.sign_up);
          firebaseAuth = FirebaseAuth.getInstance();

          sign_up.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                    String email = sign_up_email.getText().toString();
                    String pass = sign_up_password.getText().toString().trim();
                    String confimpass = sign_up_password_confirm.getText().toString().trim();

                    if (TextUtils.isEmpty(email)) {

                         Toast.makeText(SignupActivity.this, " Đăng kí thành công", Toast.LENGTH_LONG).show();
                         return;
                    }
                    if (TextUtils.isEmpty(pass)) {
                         Toast.makeText(SignupActivity.this, " Đăng kí thành công", Toast.LENGTH_LONG).show();
                         return;
                    }
                    if (TextUtils.isEmpty(confimpass)) {
                         Toast.makeText(SignupActivity.this, " Đăng kí thành công", Toast.LENGTH_LONG).show();
                         return;
                    }

                    if (pass.length()<6) {
                         Toast.makeText(SignupActivity.this, " Mật khẩu 6 số ", Toast.LENGTH_LONG).show();
                    }
                    if(pass.equals(confimpass))
                    {
                         mAuth.createUserWithEmailAndPassword(email, pass)
                                 .addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
                                      @Override
                                      public void onComplete(@NonNull Task<AuthResult> task) {
                                           if (task.isSuccessful()) {
                                                startActivity(new Intent(getApplicationContext(),MainNavActivity.class));
                                                Toast.makeText(SignupActivity.this,"",Toast.LENGTH_SHORT).show();
                                           } else {

                                                Toast.makeText(SignupActivity.this,"",Toast.LENGTH_LONG).show();
                                           }

                                           // ...
                                      }
                                 });

                    }
               }
          });
          }
}



