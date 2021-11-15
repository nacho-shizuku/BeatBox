package com.z209200731.beatbox

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable


class SoundViewModel : BaseObservable() {
    var sound: Sound? = null
        set(sound) {
            field = sound
            notifyChange()
        }


    val title: String?
        get() = sound?.name
}