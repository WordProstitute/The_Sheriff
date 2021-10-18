package us.thesheriff.library.models.battlefield

import us.thesheriff.library.models.common.Geo
import us.thesheriff.library.models.common.Image
import us.thesheriff.library.models.work.Tool
import java.util.*

data class Location(
	val id: UUID,
	val name: String,
	val type: Type,
	val state: String,
	val city: String,
	val population: Int,
	val images: List<Image>,
	val geoloc: Geo,
	val government: Government,
	val rulers: List<Ruler>,
	val goods: List<Tool>,
	val services: List<Process>,
	val terrian: Terrian,
	val history: String,
	val sites: List<Location>
)

enum class Type {
	CITY, TOWN, CORPORATE_STATE, BUSINESSS, HOME, LAND
}



