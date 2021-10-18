package us.thesheriff.library.models.battlefield

import java.util.*

data class Government(
	val id: UUID,
	val name: String,
	val governance: String,
	val policing: String,
	val influence: String,
	val allegiance: String
)
