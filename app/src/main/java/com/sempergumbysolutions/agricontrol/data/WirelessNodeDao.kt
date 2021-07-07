package com.sempergumbysolutions.agricontrol.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow


/**
 * The Data Access Object for the [WirelessNode] class.
 */
@Dao
interface WirelessNodeDao {
    @Query("SELECT * FROM wireless_nodes")
    fun getWirelessNodes(): Flow<List<WirelessNode>>

    @Insert
    suspend fun insertWirelessNode(newWirelessNode: WirelessNode): Long

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(plants: List<WirelessNode>)

    @Delete
    suspend fun deleteWirelessNode(delThisWirelessNode: WirelessNode)


}