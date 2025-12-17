package com.sge_inventario.features.authentication.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen() {
    Column  {
        TextField (
            value = "",
            onValueChange = {},
            label = { Text("Usuario") }
        )

        TextField (
            value = "",
            onValueChange = {},
            label = { Text("Contraseña") }
        )

        Button(onClick= { }) {
            Text("Iniciar Sesión")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}


