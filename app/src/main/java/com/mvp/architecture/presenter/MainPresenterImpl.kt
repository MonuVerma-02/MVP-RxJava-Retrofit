package com.mvp.architecture.presenter

import com.mvp.architecture.model.Places
import com.mvp.architecture.api.ApiService
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class MainPresenterImpl(apiService: ApiService, mainView: ContractMain.MainView) :
    ContractMain.MainPresenter {

    private val apiService = apiService;
    private val mainView = mainView

    override fun displayResult() {
        mainView.showProgress()
        apiService.getPlacesLocation()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : Observer<List<Places>> {
                override fun onNext(places: List<Places>) {
                    mainView.setDataToAdapter(places)
                }

                override fun onError(e: Throwable) {
                    mainView.hideProgress()
                }

                override fun onComplete() {
                    mainView.hideProgress()
                }

                override fun onSubscribe(d: Disposable) {
                }
            })
    }

}