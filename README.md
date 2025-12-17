4ªTAREA (15/dic/2025)
================================================================================================
1. Codificar las diferentes pantallas que conforman la interfaz de usuario
2. Usar Jetpack Compose
3. No es necesario implementar funcionalidad completa
4. Crear pantallas que reciban parámetros para mostrar el estado visual
5. Incluir elementos de interfaz como botones, TextFields
6. Seguir Clean Architecture
7. Crear previews de cada pantalla con datos de ejemplo
================================================================================================
RUTA: src/main/kotlin/com.sge_inventario/features 
- he incluido modulo la misma estructura: domain.model -- presentation
- en cada presentation he incluido dos carpetas: screens -- viewmodel 
- en cada screens he incluido las carpetas que he valorado de forma sencilla pero respetando lo solicitado
================================================================================================
  (17/dic/2025)
CONTINUACIÓN: Para poder navegar entre las pantallas:
1. Añado nueva dependencia en build.gradle.kts
2. Creo el archivo de navegacion que llamare NavitationRoutes.kt
3. Modifico Main para incluir la funcionalida de la navegación
4. MOdifico toos los screens para soprotar la navegación (inlcuido ()
   ================================================================================================
5. El componente CORE - lo eh efinido en sus tres modulos: 
   - navigation: para definir las rutas de navegación 
   - theme: donde defino tanto los colore (en uso primario y seguncario) y temas para darle una image corporativa
   - utils: donde solo he definido constante a usar a lo largo del programa









================================================================================================
# SGE Inventario

## Descripción
Sistema de Gestión de Equipamiento e Inventario desarrollado para IES ABASTOS

## Tecnologías
- Kotlin
- Jetpack Compose
- Clean Architecture
- MVVM

## Características
- Gestión de equipamiento
- Control de solicitudes
- Mantenimiento de inventario
- Informes y reportes

## Autor
Ismael Navarro Valencia





