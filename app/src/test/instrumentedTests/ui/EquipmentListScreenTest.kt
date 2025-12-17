

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class EquipmentListScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun equipmentListScreen_displaysCorrectly() {
        composeTestRule.setContent {
            EquipmentListScreen()
        }

        composeTestRule.onNodeWithText("Listado de Equipamiento").assertExists()
    }
}