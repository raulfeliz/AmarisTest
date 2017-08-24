package com.rukiasoft.amaristest.dependencyInjection.modules

import android.content.Context
import com.rukiasoft.amaristest.AmarisApplication
import com.rukiasoft.amaristest.resources.ResourcesManager
import com.rukiasoft.amaristest.resources.ResourcesManagerImplAndroid
import javax.inject.Singleton
import dagger.Provides
import com.rukiasoft.amaristest.utils.logger.AndroidLogHelperImpl
import com.rukiasoft.amaristest.utils.logger.LoggerHelper



/**
 * Created by Roll on 24/8/17.
 */
class AmarisTestModule(private val application: AmarisApplication) {


    @Provides
    @Singleton
    fun providesPayconiqApplication(): AmarisApplication {
        return application
    }

    @Provides
    @Singleton
    fun providesContext(): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun providesLogHelper(logger: AndroidLogHelperImpl): LoggerHelper {
        return logger
    }

    @Provides
    @Singleton
    fun providesResourcesManager(resources: ResourcesManagerImplAndroid): ResourcesManager {
        return resources
    }

}