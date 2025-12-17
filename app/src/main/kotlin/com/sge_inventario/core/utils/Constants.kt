// Constants.kt
package com.ismael.sge_inventario.core.utils

object Constants {
    // Constantes generales de la aplicación
    const val APP_NAME = "SGE Inventario"

    // Constantes de validación
    const val MIN_PASSWORD_LENGTH = 6
    const val MAX_USERNAME_LENGTH = 50

    // Tipos de usuarios
    object UserRoles {
        const val ADMIN = "ADMIN"
        const val OPERATOR = "OPERATOR"
        const val MANAGER = "MANAGER"
    }
}