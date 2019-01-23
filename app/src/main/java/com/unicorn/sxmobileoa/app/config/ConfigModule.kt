package com.unicorn.sxmobileoa.app.config

import android.os.Environment
import dagger.Module
import java.io.File

@Module
class ConfigModule {

    companion object {
        fun baseDir(): String {
            val downloadDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
            val baseDir = File(downloadDir, "SxMobileOA")
            if (!baseDir.exists()) baseDir.mkdir()
            return baseDir.absolutePath
        }

        //        const val baseUrl = "http://192.168.20.100:8090/reqChaOne/"
//        const val baseUrl = "http://221.11.104.98:8082/reqChaOne/"  // 汉中
//        const val baseUrl = "http://154.0.21.193:8189/busiGate/" // 内网
//        const val baseUrl = "http://113.200.190.226:10000/reqChaOne/" // 高院的外网
        const val baseUrl = "http://124.116.26.218:8333/reqChaOne/"  // 延安

        const val baseAttachmentUrl = "${baseUrl}attachRedirect.do"

        //        const val defaultFydm = "R80"
//        const val defaultFydm = "R60"   // 汉中
//        const val defaultFydm = "R00"   //
        const val defaultFydm = "R90"   // 延安

    }

}


