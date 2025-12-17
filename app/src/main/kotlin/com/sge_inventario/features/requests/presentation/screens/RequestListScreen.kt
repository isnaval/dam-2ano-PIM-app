package com.sge_inventario.features.requests.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RequestListScreen(
    onNewRequestClick: () -> Unit
) {
    Column {
        Text("Solicitud de Equipamiento")
        Button(onClick = onNewRequestClick) {
            Text("Nueva Solicitud")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RequestListScreenPreview() {
    RequestListScreen(
        onNewRequestClick = {}
    )
}