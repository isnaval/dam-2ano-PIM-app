package com.sge_inventario.features.equipment.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

data class Equipment(val id: String)

@Composable
fun EquipmentListScreen(
    onEquipmentSelected: (Equipment) -> Unit,
    onNewRequestClick: () -> Unit
) {
    Column {
        Text("Listado de Equipamiento")
        Button(onClick = onNewRequestClick) {
            Text("Nuevo equipo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EquipamentListScreenPreview() {
    EquipmentListScreen(
        onEquipmentSelected = {},
        onNewRequestClick = {}
    )
}