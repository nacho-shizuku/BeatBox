package com.z209200731.beatbox

private const val WAV = ".wav"

class Sound(val assetPath: String, var soundId: Int? = null) {
    val name = assetPath.split("/").last().removeSuffix(WAV)
}