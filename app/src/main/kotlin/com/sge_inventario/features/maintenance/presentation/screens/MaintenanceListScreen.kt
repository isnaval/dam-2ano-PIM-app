package com.sge_inventario.features.maintenance.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MaintenanceListScreen() {
    Column{
        Text("Mantenimientos Programados")
        Button(onClick = { }) {
            Text("Nuevo Mantenimiento")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MaintenanceListScreenPreview() {
    MaintenanceListScreen()
}