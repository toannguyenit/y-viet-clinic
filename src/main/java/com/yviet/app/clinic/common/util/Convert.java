package com.yviet.app.clinic.common.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Convert {
    public static synchronized LocalDateTime timeStampToLocalDateTime(Timestamp timestamp) {
        return timestamp.toLocalDateTime();
    }


    public static synchronized Integer longToInterger(Long l) {
        if (l == null) {
            return null;
        }
        return l.intValue();
    }
}
