package com.z209200731.beatbox

import androidx.databinding.BaseObservable

fun beatBoxRate(r: Int): Float =
    if (0 <= r || r <= 100) 0.5f + ((r.toFloat() / 100.0f) * 1.5f)
    else throw IllegalArgumentException("rate out of bound: $r")

class BeatBoxViewModel(private val beatBox: BeatBox) : BaseObservable() {

    val max = 100
    private var _rate: Int = 5
    private val default = 50

    init {
        beatBox.apply { rate = beatBoxRate(default) }
    }

    var rate: Int
        get() = _rate
        set(value) {
            _rate = value
            beatBox.apply { rate = beatBoxRate(_rate) }
            notifyChange()
        }
}