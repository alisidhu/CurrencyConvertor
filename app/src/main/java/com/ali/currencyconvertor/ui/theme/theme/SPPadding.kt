package com.ali.sadapayclone.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import ir.kaaveh.sdpcompose.sdp

@Immutable
data class SPPadding(
    val padding_0: Dp,
    val padding_2: Dp,
    val padding_4: Dp,
    val padding_5: Dp,
    val padding_8: Dp,
    val padding_10: Dp,
    val padding_15: Dp,
    val padding_12: Dp,
    val padding_16: Dp,
    val padding_20: Dp,
    val padding_24: Dp,
    val padding_27: Dp,
    val padding_30: Dp,
    val padding_36: Dp,
    val padding_40: Dp,
    val padding_50: Dp,
    val padding_60: Dp,
    val padding_70: Dp,
    val padding_80: Dp,
    val padding_90: Dp,
    val padding_100: Dp,
    val padding_110: Dp,
    val padding_150: Dp,
    val padding_250: Dp
)

val LocalSPPadding = staticCompositionLocalOf {
    SPPadding(
        padding_0 = Dp.Unspecified,
        padding_2 = Dp.Unspecified,
        padding_4 = Dp.Unspecified,
        padding_5 = Dp.Unspecified,
        padding_8 = Dp.Unspecified,
        padding_10 = Dp.Unspecified,
        padding_12 = Dp.Unspecified,
        padding_15 = Dp.Unspecified,
        padding_16 = Dp.Unspecified,
        padding_20 = Dp.Unspecified,
        padding_24 = Dp.Unspecified,
        padding_27 = Dp.Unspecified,
        padding_30 = Dp.Unspecified,
        padding_36 = Dp.Unspecified,
        padding_40 = Dp.Unspecified,
        padding_50 = Dp.Unspecified,
        padding_60 = Dp.Unspecified,
        padding_70 = Dp.Unspecified,
        padding_80 = Dp.Unspecified,
        padding_90 = Dp.Unspecified,
        padding_100 = Dp.Unspecified,
        padding_110 = Dp.Unspecified,
        padding_150 = Dp.Unspecified,
        padding_250 = Dp.Unspecified
    )
}

val padding: SPPadding
    @Composable
    get() = SPPadding(
        padding_0 = 0.sdp,
        padding_2 = 2.sdp,
        padding_4 = 4.sdp,
        padding_5 = 5.sdp,
        padding_8 = 8.sdp,
        padding_10 = 10.sdp,
        padding_12 = 12.sdp,
        padding_15 = 15.sdp,
        padding_16 = 16.sdp,
        padding_20 = 20.sdp,
        padding_24 = 24.sdp,
        padding_27 = 27.sdp,
        padding_30 = 30.sdp,
        padding_36 = 36.sdp,
        padding_40 = 40.sdp,
        padding_50 = 50.sdp,
        padding_60 = 60.sdp,
        padding_70 = 70.sdp,
        padding_80 = 80.sdp,
        padding_90 = 90.sdp,
        padding_100 = 100.sdp,
        padding_110 = 110.sdp,
        padding_150 = 150.sdp,
        padding_250 = 250.sdp
    )
