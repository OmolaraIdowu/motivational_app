package com.swancodes.motivationalquotes.data

import com.swancodes.motivationalquotes.R
import com.swancodes.motivationalquotes.model.Motivation

class DataSource {
    fun loadQuotes(): List<Motivation> {
        return listOf<Motivation>(
            Motivation(R.string.quote1, R.drawable.motivational_image1),
            Motivation(R.string.quote2, R.drawable.motivational_image2),
            Motivation(R.string.quote3, R.drawable.motivational_image3),
            Motivation(R.string.quote4, R.drawable.motivational_image4),
            Motivation(R.string.quote5, R.drawable.motivational_image5),
            Motivation(R.string.quote6, R.drawable.motivational_image1),
            Motivation(R.string.quote7, R.drawable.motivational_image2),
            Motivation(R.string.quote8, R.drawable.motivational_image3),
            Motivation(R.string.quote9, R.drawable.motivational_image4)
        )
    }
}