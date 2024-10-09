package co.mateocontreras.dagobah.controllers.dto

data class ExerciseDto (
    var id: String? = null,
    var name: String? = null,
    var description: String? = null,
    var category: String? = null,
    var muscularGroup: String? = null,
    var equipment: String? = null,
    var location: String? = null,
)