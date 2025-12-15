package com.sge_inventario.features.requests.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RequestListScreen() {
    Column {
        Text("Solicitud de Equipamoiento")
        Button(onClick = { }) {
            Text("Nueva Solicitud")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RequestListScreenPreview(){
    RequestListScreen()
}