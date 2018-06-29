package kondratkov.ermineapps.newain;

import android.app.Application;

public class App extends Application {

    private static App singleton;

    private static float setting_size_text;
    // Возвращает экземпляр данного класса
    public static App getInstance() {
        return singleton;
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        singleton = this;
    }

    public static float getSetting_size_text() {
        return setting_size_text;
    }

    public static void setSetting_size_text(float setting_size_text) {
        App.setting_size_text = setting_size_text;
    }
}
