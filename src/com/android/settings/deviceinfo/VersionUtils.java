
package com.android.settings.deviceinfo;

import android.os.SystemProperties;

public class VersionUtils {
    public static String getTwiceOSVersion(){
        return SystemProperties.get("org.twice.version.display","");
    }
}
