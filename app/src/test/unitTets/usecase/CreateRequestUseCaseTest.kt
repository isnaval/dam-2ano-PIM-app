
import org.junit.Test
import org.junit.Assert.*

class CreateRequestUseCaseTest {
    @Test
    fun `create request validates input correctly`() {
        val useCase = CreateRequestUseCase()
        val validRequest = EquipmentRequest(
            id = "R001",
            userId = "U001",
            equipmentId = "E001",
            status = RequestStatus.PENDING,
            reason = "Necesidad de trabajo"
        )
        assertTrue(useCase.validate(validRequest))
    }
}