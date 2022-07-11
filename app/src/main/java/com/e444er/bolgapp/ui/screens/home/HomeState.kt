package com.e444er.bolgapp.ui.screens.home

import com.e444er.domain.model.Blog

data class HomeState(
    var isLoading: Boolean = false,
    var data: List<Blog>? = null,
    var error: String = ""
)
