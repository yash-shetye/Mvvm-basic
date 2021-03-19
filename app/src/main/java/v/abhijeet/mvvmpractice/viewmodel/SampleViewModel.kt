package v.abhijeet.mvvmpractice.viewmodel

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleViewModel : ViewModel() {

var textdata = MutableLiveData<String>()
    var editText = MutableLiveData<String>()

    fun OnClick(@Suppress("UNUSED_PARAMETER")view : View){
        textdata.value = editText.value
    }
}