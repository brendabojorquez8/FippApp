package bojorquez.brenda.fippapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.activity_balance_ingresos.*


class BalanceIngresos: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_balance_ingresos)

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

        btn_gastos.setOnClickListener {
            val intent: Intent = Intent(this, BalanceGastos::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener {
            val intent: Intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        btn_clasificacion.setOnClickListener {
            val intent: Intent = Intent(this, ClasificacionIngresos::class.java)
            startActivity(intent)
        }

        btn_clategorías.setOnClickListener {
            val intent: Intent = Intent(this, CategoriasIngresos::class.java)
            startActivity(intent)
        }

        btn_fijos.setOnClickListener {
            val intent: Intent = Intent(this, IngresosFijos::class.java)
            startActivity(intent)
        }

    }
}