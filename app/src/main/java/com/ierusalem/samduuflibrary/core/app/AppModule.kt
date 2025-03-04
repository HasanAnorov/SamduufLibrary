package com.ierusalem.samduuflibrary.core.app

import android.app.Application
import com.ierusalem.samduuflibrary.core.preferences.DataStorePreferenceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDataStore(application: Application): DataStorePreferenceRepository {
        return DataStorePreferenceRepository(application)
    }

}