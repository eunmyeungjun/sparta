package com.example.spartaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class SignInActivity : AppCompatActivity() {

    private lateinit var idEditText : EditText
    private lateinit var passWordEditText : EditText
    private lateinit var activityResultLauncher : ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        idEditText = findViewById<EditText>(R.id.et_id)
        passWordEditText = findViewById<EditText>(R.id.et_passWord)
        val btnLogIn = findViewById<Button>(R.id.btn_logIn)
        btnLogIn.setOnClickListener {

            if (idEditText.text.isEmpty() || passWordEditText.text.isEmpty()){
                Toast.makeText(this, "아이디 / 비밀번호를 확인해 주세요" ,Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this , "로그인 되었습니다",Toast.LENGTH_SHORT).show()

            val userId : String = idEditText.text.toString()

            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("userId",userId)
            startActivity(intent)
        }



        val btnSignUp = findViewById<Button>(R.id.btn_signUp)
        btnSignUp.setOnClickListener {
            val intent = Intent(this , SignUpActivity::class.java)
            activityResultLauncher.launch(intent)
        }

        activityResultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {result ->
            if (result.resultCode == RESULT_OK) {
                val signUpId = result.data?.getStringExtra("id") ?: ""
                val signUpPassWord = result.data?.getStringExtra("password") ?: ""
                idEditText.setText(signUpId)
                passWordEditText.setText(signUpPassWord)
            }
        }




//            val intent = Intent(this , SignUpActivity::class.java)
//            activityResultLauncher.launch(intent)

//        resultLauncher =
//            registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result ->
//                if (result.resultCode == RESULT_OK){
//                    val signUpId = result.data?.getStringExtra("Id") ?: ""
//                    val signUpPassWord = result.data?.getStringExtra("passWord") ?: ""
//
//                    idEditText.setText(signUpId)
//                    idEditText.setText(signUpPassWord)

        }
    }
