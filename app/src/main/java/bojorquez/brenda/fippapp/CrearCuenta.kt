package bojorquez.brenda.fippapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.*
import com.google.firebase.firestore.*
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_crear_cuenta.*

class CrearCuenta : AppCompatActivity() {

    private lateinit var storage: FirebaseFirestore
    private lateinit var auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {

        storage = FirebaseFirestore.getInstance()
        auth = FirebaseAuth.getInstance()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cuenta)

        btn_back_login.setOnClickListener{
            this.finish()
        }

        btn_crear_cuenta.setOnClickListener {
            valida_registro()
        }

    }

    private fun valida_registro(){
        var username: String = et_nombre_usuario.text.toString()
        var correo: String = et_correo_usuario.text.toString()
        var contra1: String = et_contras1.text.toString()
        var contra2: String = et_contras2.text.toString()

        auth.createUserWithEmailAndPassword(correo,contra1).addOnCompleteListener(this) {
            // If register is successful, send them to home screen
            if (it.isSuccessful) {
                Log.d("FIREBASE", "User created successfully");
                val user = hashMapOf(
                    "name" to username,
                    "email" to correo,
                    "password" to contra1,
                )

                val db = Firebase.firestore;

                db.collection("users").document(correo)
                    .set(user)
                    .addOnSuccessListener {
                        val intent = Intent(this, MainActivity::class.java);
                        startActivity(intent);
                    }
                    .addOnFailureListener { e ->
                        Log.e("FIREBASE", "User document creation failed: $e");
                        Toast.makeText(this, "$e", Toast.LENGTH_SHORT).show()
                    }
            } else {
                // if an error occurs, show error message in Toast
                Log.e("FIREBASE", "User creation failed: ${it.exception?.message}");
                Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}