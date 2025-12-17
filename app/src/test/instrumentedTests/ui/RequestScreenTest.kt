
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class RequestScreenTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun requestScreen_displaysCorrectly() {
        composeTestRule.setContent {
            RequestListScreen()
        }

        composeTestRule.onNodeWithText("Solicitudes de Equipamiento").assertExists()
    }
}