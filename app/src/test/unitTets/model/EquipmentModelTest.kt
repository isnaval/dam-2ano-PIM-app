
import org.junit.Test
import org.junit.Assert.*

class EquipmentModelTest {
    @Test
    fun `equipment model creation is correct`() {
        val equipment = Equipment(
            id = "001",
            name = "Portátil",
            status = EquipmentStatus.AVAILABLE
        )
        assertEquals("001", equipment.id)
        assertEquals("Portátil", equipment.name)
        assertEquals(EquipmentStatus.AVAILABLE, equipment.status)
    }
}
