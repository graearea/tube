package com.johnrae.tubestop.app;

import android.content.SharedPreferences;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

/**
 * Created by jrae on 18/06/2014.
 */
public class WifiStorageTest {
    private WifiStorage underTest;

    @Test
    public void should() throws Exception {
        SharedPreferences stub= new SharedPreferences() {
            @Override
            public Map<String, ?> getAll() {
                return null;
            }

            @Override
            public String getString(final String key, final String defValue) {
                return null;
            }

            @Override
            public Set<String> getStringSet(final String key, final Set<String> defValues) {
                return null;
            }

            @Override
            public int getInt(final String key, final int defValue) {
                return 0;
            }

            @Override
            public long getLong(final String key, final long defValue) {
                return 0;
            }

            @Override
            public float getFloat(final String key, final float defValue) {
                return 0;
            }

            @Override
            public boolean getBoolean(final String key, final boolean defValue) {
                return false;
            }

            @Override
            public boolean contains(final String key) {
                return false;
            }

            @Override
            public Editor edit() {
                return null;
            }

            @Override
            public void registerOnSharedPreferenceChangeListener(final OnSharedPreferenceChangeListener listener) {

            }

            @Override
            public void unregisterOnSharedPreferenceChangeListener(final OnSharedPreferenceChangeListener listener) {

            }
        };
        underTest =new WifiStorage(stub);


    }
}
