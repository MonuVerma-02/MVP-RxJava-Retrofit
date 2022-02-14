package com.mvp.architecture.model

import com.mvp.architecture.extention.empty

data class Places(
    val id: Int = Int.empty(),
    val location: String = String.empty(),
    val image: String = String.empty(),
    val description: String = String.empty()
)
