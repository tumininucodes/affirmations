package com.kith.affirmations.model

import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @drawableRes val imageResourceId: Int,) {


}

annotation class drawableRes
