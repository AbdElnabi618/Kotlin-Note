package com.udacity.notepad.data

import java.util.*
import kotlin.collections.ArrayList

data class Note (
    var id : Int= -1,
    var text: String? = null,
    var isPinned : Boolean= false,
    var createdAt : Date= Date(),
    var updatedAt: Date? = null
)