package com.sge_inventario.features.requests.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NewRequestScreen() {
    Column {
        Text("Crear Nueva Solicitud")
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Equipo Solicitado") }
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Motivo") }
        )
        Button(onClick = { }) {
            Text("Enviar Solicitud")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun NewRequestScreenPreview() {
    NewRequestScreen()
}