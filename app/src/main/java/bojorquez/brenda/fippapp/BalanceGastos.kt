package bojorquez.brenda.fippapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.activity_balance_gastos.*

class BalanceGastos : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balance_gastos)

        val graphView = findViewById<View>(R.id.idGraphView) as GraphView
        val series = LineGraphSeries(
            arrayOf<DataPoint>(
                DataPoint(0.0, 1.0),
                DataPoint(1.0, 5.0),
                DataPoint(2.0, 3.0),
                DataPoint(3.0, 2.0),
                DataPoint(4.0, 6.0)
            )
        )
        graphView.addSeries(series)

        btn_Ingresos.setOnClickListener {
            val intent: Intent = Intent(this, BalanceIngresos::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
            startActivity(intent)
        }


        btn_clasificacion.setOnClickListener {
            val intent: Intent = Intent(this, ClasificacionGastos::class.java)
            startActivity(intent)
        }

        btn_clategorías.setOnClickListener {
            val intent: Intent = Intent(this, CategoriasGastos::class.java)
            startActivity(intent)
        }

        btn_fijos.setOnClickListener {
            val intent: Intent = Intent(this, GastosFijos::class.java)
            startActivity(intent)
        }

    }
}