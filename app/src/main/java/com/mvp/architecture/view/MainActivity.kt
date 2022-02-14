package com.mvp.architecture.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.recyclerview.widget.LinearLayoutManager
import com.mvp.architecture.databinding.ActivityMainBinding
import com.mvp.architecture.model.Places
import com.mvp.architecture.presenter.ContractMain
import com.mvp.architecture.presenter.MainPresenterImpl
import com.mvp.architecture.api.ApiClient

class MainActivity : AppCompatActivity(), ContractMain.MainView {
    private lateinit var viewBinding: ActivityMainBinding
    private lateinit var mainPresenterImpl: MainPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val apiService = ApiClient.getApiInstance()
        mainPresenterImpl = MainPresenterImpl(apiService, this)
        mainPresenterImpl.displayResult()
    }

    override fun showProgress() {
        viewBinding.progressBar.visibility = VISIBLE
    }

    override fun hideProgress() {
        viewBinding.progressBar.visibility = GONE
    }

    override fun setDataToAdapter(listPlaces: List<Places>) {
        viewBinding.recyclerView.layoutManager = LinearLayoutManager(this)
        viewBinding.recyclerView.adapter = PlacesAdapter(listPlaces)
    }
}