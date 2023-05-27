package com.example.kccentregaandroidavanzado.UI.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kccentregaandroidavanzado.Data.Repository
import com.example.kccentregaandroidavanzado.SuperHero
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HerosViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    private val _heros = MutableLiveData<List<SuperHero>>()
    val heros: LiveData<List<SuperHero>> get() = _heros


    fun getHeros(){
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO){
                repository.getHeros()
            }

            _heros.value = result
        }
    }





}