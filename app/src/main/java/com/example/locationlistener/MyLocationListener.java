package com.example.locationlistener;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Created by hp on 8/24/2016.
 */
public class MyLocationListener implements LocationListener {

    Context context;
    String TAG = "location";
    TextView coordinates;

    MyLocationListener(Context context, TextView coordinates){
        this.context = context;
        this.coordinates = coordinates;
    }

    @Override
    public void onLocationChanged(Location loc) {
        Toast.makeText( context, "Location changed: Lat: " + loc.getLatitude() + " Lng: " + loc.getLongitude(), Toast.LENGTH_SHORT).show();

        String longitude = "Longitude: " + loc.getLongitude();
        Log.v(TAG, longitude);
        String latitude = "Latitude: " + loc.getLatitude();
        Log.v(TAG, latitude);

        coordinates.setText(latitude+","+longitude);

    }

    @Override
    public void onProviderDisabled(String provider) {}

    @Override
    public void onProviderEnabled(String provider) {}

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {}
}
