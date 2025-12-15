package com.sge_inventario.features.reports.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ReportsListScreen() {
    Column {
        Text("Informes de Inventario")
        Button(onClick = { }) {
            Text("Generar Informe")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReportsListScreenPreview() {
    ReportsListScreen()
}