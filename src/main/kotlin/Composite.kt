import kotlinx.serialization.Serializable

@Serializable
data class Composite (
    @Serializable(with = ID.Companion::class)
    val id: ID, // <- error thrown here
    val name: String
)