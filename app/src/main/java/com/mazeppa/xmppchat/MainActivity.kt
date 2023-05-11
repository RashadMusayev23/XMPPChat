package com.mazeppa.xmppchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var connectionConfiguration: XMPPTCPConnectionConfiguration? = null

        try {
            connectionConfiguration = XMPPTCPConnectionConfiguration.builder()
                .setUsernameAndPassword("username", "password")
                .setXmppDomain("server.im")
                .setKeystoreType(null)
                .build()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}