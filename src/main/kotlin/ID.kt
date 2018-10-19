import kotlinx.serialization.Decoder
import kotlinx.serialization.Encoder
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer

@Serializable(with = ID.Companion::class)
inline class ID(val id: Int) {

    @Serializer(forClass = ID::class)
    companion object {
        override fun serialize(output: Encoder, obj: ID) {
            output.encodeInt(obj.id)
        }

        override fun deserialize(input: Decoder): ID {
            return ID(input.decodeInt())
        }
    }
}