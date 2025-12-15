package com.sge_inventario.features.authentication.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RegisterScreen() {
    Column() {
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("nombre")},
        )

        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Correo Electrónico")}
        )

        Button(onClick = { }) {
            Text("Registrarse")
        }
    }
}

@Preview(showBackground =  true)
@Composable
fun RegisterScreenPreview() {
    RegisterScreen()
}