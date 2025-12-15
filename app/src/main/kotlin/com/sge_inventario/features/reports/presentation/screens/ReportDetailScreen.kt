package com.sge_inventario.features.reports.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ReportDetailScreen() {
    Column {
        Text("Detalle de Informe")
        Button(onClick = { }) {
            Text("Exportar Informe")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReportDetailScreenPreview() {
    ReportDetailScreen()
}