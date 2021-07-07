package com.sempergumbysolutions.agricontrol.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import java.time.ZonedDateTime


/**
 * [WirelessNode] represents when a BT or BLE advertisement is received, with useful metadata.
 */
@Entity(tableName = "wireless_nodes")
data class WirelessNode(
    /**
     * Indicates the mac address of the wireless node
     */
    @PrimaryKey @ColumnInfo(name = "id") val hwId: String,

    /**
     * Advertised name
     */
    val name: String,

    /**
     * Indicates which wireless protocol the device was using when seen
     */
    @ColumnInfo(name = "phy_type") val phy_type: PhyTypes,

    /**
     * Indicates when the [BTNode] advertisement was recorded.
     */
    @ColumnInfo(name = "last_seen_date") val lastSeenDate: ZonedDateTime = ZonedDateTime.now(),
)