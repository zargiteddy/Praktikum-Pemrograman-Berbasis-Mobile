/*
 *  Copyright 2019, The Android Open Source Project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.example.android.marsrealestate.detail

import android.app.Application
import androidx.lifecycle.*
import com.example.android.marsrealestate.R
import com.example.android.marsrealestate.network.MarsProperty

/**
 * The [ViewModel] that is associated with the [DetailFragment].
 */
class DetailViewModel(@Suppress("UNUSED_PARAMETER")marsProperty: MarsProperty,
                      app: Application) : AndroidViewModel(app) {
    private val _selectedProperty = MutableLiveData<MarsProperty>()
    val selectedProperty: LiveData<MarsProperty>
        get() = _selectedProperty

    init {
        _selectedProperty.value = marsProperty
    }
    val displayUsername = Transformations.map(selectedProperty) {
        app.applicationContext.getString(
                when (it.isCukup) {
                    true -> R.string.display_username
                    false -> R.string.display_username
                }, it.username)
    }

    val displayNama = Transformations.map(selectedProperty) {
        app.applicationContext.getString(
                when (it.isCukup) {
                    true -> R.string.display_nama
                    false -> R.string.display_nama
                }, it.nama)
    }

    val displayUmur = Transformations.map(selectedProperty) {
        app.applicationContext.getString(
                when (it.isCukup) {
                    true -> R.string.display_umur
                    false -> R.string.display_umur
                }, it.umur)
    }

    val displayStatusUmur = Transformations.map(selectedProperty) {
        app.applicationContext.getString(R.string.display_type,
                app.applicationContext.getString(
                        when (it.isCukup) {
                            true -> R.string.umur_cukup
                            false -> R.string.umur_kurang
                        }))
    }
}
