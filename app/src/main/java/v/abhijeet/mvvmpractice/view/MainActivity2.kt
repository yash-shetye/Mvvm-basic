package v.abhijeet.mvvmpractice.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModelProvider
import v.abhijeet.mvvmpractice.R
import v.abhijeet.mvvmpractice.viewmodel.SampleViewModel
import v.abhijeet.mvvmpractice.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding
    lateinit var viewModel : SampleViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main2)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
        viewModel = ViewModelProvider(this).get(SampleViewModel::class.java)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        viewModel.editText.observe(this, Observer {
           // viewModel.editText.value = it.toString()
            Log.d("hello" , it.toString())
        })

        viewModel.textdata.value = "Text before Change"

    }
}