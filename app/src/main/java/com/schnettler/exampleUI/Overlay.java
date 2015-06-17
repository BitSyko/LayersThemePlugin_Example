package com.schnettler.exampleUI;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import com.lovejoy777.rroandlayersmanager.IOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Niklas on 02.06.2015.
 */
public class Overlay extends Service {
    static final String LOG_TAG = "PluginService2";
    Context mContext;
    private final static int BUFFER_SIZE = 1024;

    public void onStart(Intent intent, int startId) {
        super.onStart( intent, startId );
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        return mulBinder;
    }

    private final IOperation.Stub mulBinder =
            new IOperation.Stub() {
                public int operation(int i1, int i2) {

                    return i1 * i2;


                }
            };
}