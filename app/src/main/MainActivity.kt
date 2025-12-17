package com.ismael.sge_inventario

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ismael.sge_inventario.core.navigation.NavigationRoutes
import com.ismael.sge_inventario.core.theme.SGEInventarioTheme
import com.ismael.sge_inventario.features.authentication.presentation.screens.LoginScreen
import com.ismael.sge_inventario.features.equipment.presentation.screens.EquipmentListScreen
import com.ismael.sge_inventario.features.equipment.presentation.screens.EquipmentDetailScreen
import com.ismael.sge_inventario.features.requests.presentation.screens.RequestListScreen
import com.ismael.sge_inventario.features.requests.presentation.screens.NewRequestScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SGEInventarioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = NavigationRoutes.LOGIN
                    ) {
                        composable(NavigationRoutes.LOGIN) {
                            LoginScreen { navController.navigate(NavigationRoutes.EQUIPMENT_LIST) }
                        }

                        composable(NavigationRoutes.EQUIPMENT_LIST) {
                            EquipmentListScreen(
                                onEquipmentSelected = { equipment ->
                                    navController.navigate("${NavigationRoutes.EQUIPMENT_DETAIL}/${equipment.id}")
                                },
                                onNewRequestClick = {
                                    navController.navigate(NavigationRoutes.NEW_REQUEST)
                                }
                            )
                        }

                        composable("${NavigationRoutes.EQUIPMENT_DETAIL}/{equipmentId}") { backStackEntry ->
                            EquipmentDetailScreen(
                                equipmentId = backStackEntry.arguments?.getString("equipmentId")
                            )
                        }

                        composable(NavigationRoutes.REQUEST_LIST) {
                            RequestListScreen {
                                navController.navigate(NavigationRoutes.NEW_REQUEST)
                            }
                        }

                        composable(NavigationRoutes.NEW_REQUEST) {
                            NewRequestScreen {
                                navController.navigateUp()
                            }
                        }
                    }
                }
            }
        }
    }
}