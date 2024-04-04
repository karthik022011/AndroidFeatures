package com.kartheek.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = AppConstants.DATA_STORE_NAME)

class DataStoreManagerImpl (val context: Context) {

    companion object {
        val EMAIL = stringPreferencesKey("EMAIL")
    }


}