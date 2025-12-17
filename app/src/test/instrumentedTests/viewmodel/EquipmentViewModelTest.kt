
import org.junit.Test
import org.junit.Assert.*

class EquipmentViewModelTest {
    @Test
    fun `view model loads equipment list`() {
        val viewModel = EquipmentViewModel()
        val equipmentList = viewModel.equipmentList.value
        assertNotNull(equipmentList)
    }
}