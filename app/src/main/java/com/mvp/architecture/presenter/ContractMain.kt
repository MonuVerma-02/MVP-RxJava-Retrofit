package com.mvp.architecture.presenter

import com.mvp.architecture.model.Places

interface ContractMain {

    interface MainView {
        fun showProgress()
        fun hideProgress()
        fun setDataToAdapter(listPlaces: List<Places>)
    }

    interface MainPresenter {
        fun displayResult()
    }
}