package cr.ac.una.lab4

import android.graphics.Bitmap
import java.io.Serializable

data class Transaction(
    var id: String,
    var monto: Double,
    var tipoTarjeta: String,
    var fecha: String,
    var foto: Bitmap
) : Serializable {
    override fun toString(): String {
        return "Monto: $monto, Tipo de Tarjeta: $tipoTarjeta, Fecha: $fecha"
    }
}
/*package cr.ac.una.lab4

import java.io.Serializable

data class Transaction(
    var captureButton: String, // Asume que captureButton es un String, cambia el tipo según sea necesario
    var dateEditText: String, // Asume que dateEditText es un String, cambia el tipo según sea necesario
    var SelectorTIpoTarjeta: String, // Asume que SelectorTIpoTarjeta es un String, cambia el tipo según sea necesario
    var EspacioMonto: Double, // Asume que EspacioMonto es un Double, cambia el tipo según sea necesario

) : Serializable */