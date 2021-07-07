package com.sempergumbysolutions.agricontrol.data

import androidx.room.TypeConverter

/**
 * Type converters to allow Room to reference complex data types.
 */
class Converters {
    //@TypeConverter fun calendarToDatestamp(calendar: Calendar): Long = calendar.timeInMillis

    //@TypeConverter fun datestampToCalendar(value: Long): Calendar =
    //    Calendar.getInstance().apply { timeInMillis = value }
}
