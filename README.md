# MVPRxJavaRetrofit - Android Architecture


<img align="right" src="https://bit.ly/3uJRXxr" width="300">

Sample app that demonstrates the usage of Rxjava & Retrofit with Kotlin & MVP architecture.<br/>
Including:  
 * RxJava
 * Retrofit

<br/>

 ## What is MVP (ModelViewPresenter)?

 - View is a layer that displays data and reacts to user actions. On Android, this could be an Activity, a Fragment, an android.view.View or a Dialog.
 - Model is a data access layer such as database API or remote server API.
 - Presenter is a layer that provides View with data from Model. Presenter also handles background tasks.

<br/>

 ## 🚀 Learning Tips:

 - For Learning to implement the  rxjava & retrofit in MVP architecture to the follow below steps:
 - First create Model class and it is used for parsing server response with the help of third party library like gson.
 - Create Presenter class, it is used for communication between Model & View with the help of interfaces.
 - In Presenter class, written your main logic like networking API call with the help of rxjava for fetching data from server.
 - In Main Activity it will be trigger to update data with the help of interface which is sent by Presenter and now after that you can update UI.
 - This is simple steps to create MVP architecture using rxjava & retrofit.