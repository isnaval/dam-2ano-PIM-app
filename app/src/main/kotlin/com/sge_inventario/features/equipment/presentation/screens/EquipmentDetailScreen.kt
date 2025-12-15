package com.sge_inventario.features.equipment.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EquipmentDetailScreen() {
    Column {
        Text("Detalles del Equipo")
        TextField(
            value= "",
            onValueChange= {},
            label = { Text("Nombre") }
        )
        Button(onClick = { }) {
            Text("Guardar Cambios")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EquipamentDetalScreenPreview() {
    EquipmentListScreen()
}