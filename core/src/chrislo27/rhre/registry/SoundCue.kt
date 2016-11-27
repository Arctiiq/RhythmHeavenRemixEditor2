package chrislo27.rhre.registry

data class SoundCue(val id: String, val fileExtension: String = "ogg", val name: String,
					val deprecated: List<String> = mutableListOf(), val duration: Float,
					val canAlterPitch: Boolean = false, val canAlterDuration: Boolean = false,
					val introSound: String? = null, val baseBpm: Float = 0f, val loops: Boolean = false) {

}