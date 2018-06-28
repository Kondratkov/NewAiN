package kondratkov.ermineapps.newain;

import android.app.Application;

public class App extends Application {

    private static App singleton;
    // Возвращает экземпляр данного класса
    public static App getInstance() {
        return singleton;
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        singleton = this;

    }
}
