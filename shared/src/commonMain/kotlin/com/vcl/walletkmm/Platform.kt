package com.vcl.walletkmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform