package com.abecerra.pvt_computation.data.output

data class PvtFix(
    var pvtLatLng: PvtLatLng = PvtLatLng()
)

data class PvtLatLng(
    var lat: Double = 0.0,
    var lng: Double = 0.0,
    var altitude: Double = 0.0,
    var clockBias: Double = 0.0
)

data class PvtEcef(
    var x: Double = -1.0,
    var y: Double = -1.0,
    var z: Double = -1.0,
    var clockBias: Double = 0.0,
    var interSystemBias: Double = 0.0
)
