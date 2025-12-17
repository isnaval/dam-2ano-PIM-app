

import org.junit.Test
import org.junit.Assert.*

class RequestModelTest {
    @Test
    fun `request model creation is correct`() {
        val request = EquipmentRequest(
            id = "R001",
            userId = "U001",
            equipmentId = "E001",
            status = RequestStatus.PENDING,
            reason = "Necesidad de trabajo"
        )
        assertEquals("R001", request.id)
        assertEquals("U001", request.userId)
        assertEquals(RequestStatus.PENDING, request.status)
    }
}