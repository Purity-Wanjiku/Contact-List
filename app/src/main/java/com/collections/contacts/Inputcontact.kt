package com.collections.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast

import com.collections.contacts.databinding.ActivityInputcontactBinding

class Inputcontact: AppCompatActivity() {
    lateinit var binding: ActivityInputcontactBinding



        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityInputcontactBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.tvAddContact.setOnClickListener {
                val intent = Intent(this@Inputcontact, MainActivity::class.java)
                startActivity(intent)
            }
        }

        override fun onResume() {
            super.onResume()


            validateSignUp()
            clearErrorOnType()

        }

        fun validateSignUp() {

            val fullName = binding.etfullname.text.toString()
            val email = binding.etemail.text.toString()
            val phone = binding.etphonenumber.text.toString()
            var error = false

            if (fullName.isBlank()) {
                binding.etfullname.error = "Name is required"
                error = true
            } else {
                binding.tilfullname.error = null
            }

            if (email.isBlank()) {
                binding.etemail.error = "Email is required"
                error = true
            } else {
                binding.tilemail.error = null
            }

            if (phone.isEmpty()) {
                binding.etphonenumber.error = "Phone Number is required"
                error = true
            } else {
                binding.tilphonenumber.error = null
            }

            if (!error) {
                Toast.makeText(this, "$fullName $email $phone", Toast.LENGTH_LONG).show()
            }
        }

        fun clearErrorOnType() {
            binding.tilfullname.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilfullname.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            })



            binding.tilphonenumber.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilphonenumber.error = null
                }

                override fun afterTextChanged(s: Editable?) {

                }
            })

            binding.tilemail.editText?.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(
                    s: CharSequence?,
                    start: Int,
                    count: Int,
                    after: Int
                ) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    binding.tilemail.error = null
                }

                override fun afterTextChanged(s: Editable?) {
                }
            })
        }
    }

