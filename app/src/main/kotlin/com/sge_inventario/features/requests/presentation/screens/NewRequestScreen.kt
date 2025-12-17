package com.sge_inventario.features.requests.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NewRequestScreen(
    onNavigateUp: () -> Unit = {}
) {
    var equipmentRequested by remember { mutableStateOf("") }
    var reason by remember { mutableStateOf("") }

    Column {
        Text("Crear Nueva Solicitud")

        TextField(
            value = equipmentRequested,
            onValueChange = { equipmentRequested = it },
            label = { Text("Equipo Solicitado") }
        )

        TextField(
            value = reason,
            onValueChange = { reason = it },
            label = { Text("Motivo") }
        )

        Button(onClick = onNavigateUp) {
            Text("Enviar Solicitud")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NewRequestScreenPreview() {
    NewRequestScreen()
}