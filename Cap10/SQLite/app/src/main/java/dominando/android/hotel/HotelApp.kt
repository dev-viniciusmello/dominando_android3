package dominando.android.hotel

import android.app.Application
import dominando.android.hotel.di.androidModule
import org.koin.android.ext.android.startKoin
import org.koin.standalone.StandAloneContext.stopKoin

class HotelApp : Application() {
    override fun onCreate() {
        super.onCreate()
        
        //Usando a dependência do site disponível: https://insert-koin.io/docs/quickstart/kotlin/ 
        startKoin {
            printLogger()
            modules(androidModule)
        }
        
        // startKoin(this, listOf(androidModule))
    
    }
    override fun onTerminate() {
        super.onTerminate()
        stopKoin()
    }
}
