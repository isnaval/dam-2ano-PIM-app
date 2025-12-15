package com.sge_inventario.features.maintenance.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MaintenanceDetailScreen() {
    Column {
        Text("Detalle de Mantenimiento")
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Descripción") }
        )
        Button(onClick = { }) {
            Text("Actualizar Mantenimiento")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MaintenanceDetailScreenPreview() {
    MaintenanceDetailScreen()
}