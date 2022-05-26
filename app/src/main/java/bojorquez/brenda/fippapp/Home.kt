package bojorquez.brenda.fippapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btn_Ingresos.setOnClickListener {
            val intent: Intent = Intent(this, BalanceIngresos::class.java)
            startActivity(intent)
        }

        btn_gastos.setOnClickListener {
            val intent: Intent = Intent(this, BalanceGastos::class.java)
            startActivity(intent)
        }

        btn_agregar_ingreso.setOnClickListener {
            val intent: Intent = Intent(this, RegistrarIngreso::class.java)
            startActivity(intent)
        }

        btn_agregar_gastos.setOnClickListener {
            val intent: Intent = Intent(this, RegistrarGasto::class.java)
            startActivity(intent)
        }

    }
}